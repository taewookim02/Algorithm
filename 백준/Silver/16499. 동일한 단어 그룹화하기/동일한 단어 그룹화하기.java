import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String[] split = sc.nextLine().split("");

			// selection sort split
			for (int j = 0; j < split.length; j++) {
				int minIdx = j;

				for (int k = j + 1; k < split.length; k++) {
					if (split[k].compareTo(split[minIdx]) < 0) {
						minIdx = k;
					}
				}

				String temp = split[j];
				split[j] = split[minIdx];
				split[minIdx] = temp;
			}

			String after = String.join("", split);
			map.put(after, map.getOrDefault(after, 0) + 1);
		}

		System.out.println(map.size());
	}

}
