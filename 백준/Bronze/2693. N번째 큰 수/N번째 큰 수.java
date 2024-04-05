import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int idx = 0; idx < N; idx++) {
			int[] arr = new int[10];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			// selection sort arr desc
			for (int i = 1; i < arr.length; i++) {
				int key = arr[i];
				int j = i - 1;
				
				while (j >= 0 && arr[j] < key) {
					arr[j + 1] = arr[j];
					j--;
				}
				
				arr[j + 1] = key;
			}
			
			System.out.println(arr[2]);
		}
	}
}
