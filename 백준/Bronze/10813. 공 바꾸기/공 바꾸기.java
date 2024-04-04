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
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;
			int temp = 0;
			
			// i번 바구니와 j번 바구니에 들어있는 공을 교환
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for (int val : arr) {
			System.out.print(val + " ");
		}
		

	}
}
