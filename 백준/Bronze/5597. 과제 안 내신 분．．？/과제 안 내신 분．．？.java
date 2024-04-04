import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];

		for (int i = 0; i < arr.length - 2; i++) {
			int stu = sc.nextInt() - 1;
			arr[stu]++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				System.out.println(i + 1);
			}
		}

	}
}
