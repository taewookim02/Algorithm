import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String[] split = sc.nextLine().split(" ");
			map.put(split[0], map.getOrDefault(split[0], 0) + Integer.parseInt(split[1]));
		}

		for (Integer qty : map.values()) {
			if (qty == 5) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}

}
