import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int primeCount = 0;
		for (int i = 0; i < N; i++) {
			int count = 0;
			for (int j = 2; j <= arr[i]; j++) {
				if (arr[i] % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				primeCount++;
			} 
		}
		System.out.println(primeCount);

	}
}
