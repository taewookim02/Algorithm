import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(sc.nextLine());
			Map<String, Integer> map = new HashMap<>();

			for (int j = 0; j < N; j++) {
				String[] split = sc.nextLine().split(" ");
				map.put(split[1], map.getOrDefault(split[1], 1) + 1);
			}

			int count = 1;

			for (Integer val : map.values()) {
				count *= val;
			}
			System.out.println(count - 1);
		}
	}
}
