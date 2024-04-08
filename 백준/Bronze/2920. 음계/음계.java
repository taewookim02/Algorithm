import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		boolean isAscending = false;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] <= arr[i + 1]) {
				isAscending = true;
			} else {
				isAscending = false;
				break;
			}
		}

		boolean isDescending = false;
		boolean isMixed = false;
		if (isAscending) {
			System.out.println("ascending");
			return;
		} else {
			// desc or mixed
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] >= arr[i + 1]) {
					isDescending = true;
				} else {
					isMixed = true;
					isDescending = false;
					System.out.println("mixed");
					break;
				}
			}
		}

		if (isDescending) {
			System.out.println("descending");
		}

	}

}
