import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < T; i++) {
			Map<Integer, Integer> map = new HashMap<>();
			int N = Integer.parseInt(sc.nextLine());
			String[] firstPublic = sc.nextLine().split(" ");
			String[] secondPublic = sc.nextLine().split(" ");

			for (int j = 0; j < N; j++) {
				map.put(java.util.Arrays.asList(firstPublic).indexOf(secondPublic[j]), j);
			}
			
			String[] cipherText = sc.nextLine().split(" ");

			for (Integer idx : map.values()) {
				System.out.print(cipherText[idx] + " ");
			}
			System.out.println();
		}
	}
}
