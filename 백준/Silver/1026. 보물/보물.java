import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];

		// assign elems in arrays
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			B[i] = sc.nextInt();
		}

		// sort A asc
		for (int i = 1; i < A.length; i++) {
			int key = A[i];
			int j = i - 1;

			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}

			A[j + 1] = key;
		}

		// sort B desc
		for (int i = 1; i < B.length; i++) {
			int key = B[i];
			int j = i - 1;

			while (j >= 0 && B[j] < key) {
				B[j + 1] = B[j];
				j--;
			}

			B[j + 1] = key;
		}

		
		int result = 0;
		for (int i = 0; i < N; i++) {
			result += A[i] * B[i];
		}
		
		System.out.println(result);
	}
}
