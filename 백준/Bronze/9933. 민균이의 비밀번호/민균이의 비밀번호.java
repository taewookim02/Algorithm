import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String word = sc.nextLine();
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		String myKey = "";
		for (String key : map.keySet()) {
			if (map.containsKey(reverse(key))) {
				myKey = key;
				break;
			}
		}

		int m = myKey.length() / 2;
		System.out.println(myKey.length() + " " + myKey.charAt(m));

	}

	static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
