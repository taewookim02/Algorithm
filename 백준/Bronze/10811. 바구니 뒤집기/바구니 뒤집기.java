import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		for (int idx = 0; idx < M; idx++) {
			int i = sc.nextInt() - 1; // 0
			int j = sc.nextInt() - 1; // 1

			// i 에서 j까지의 arr
			int[] copyArr = Arrays.copyOfRange(arr, i, j + 1);
			int[] revArr = new int[copyArr.length];
			
			// reverse copied arr
			for (int copyIdx = copyArr.length - 1, k = 0; copyIdx >= 0; copyIdx--, k++) {
				revArr[k] = copyArr[copyIdx];
			}
			
			// arr의 i에서 j까지 revArr를 하나씩 넣어주기
			for (int arrIdx = i, revIdx = 0; arrIdx <= j; arrIdx++, revIdx++) {
				arr[arrIdx] = revArr[revIdx];
			}
		}
		
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}
}
