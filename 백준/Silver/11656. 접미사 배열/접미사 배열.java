import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = new String[str.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.substring(i);
		}

		// Insertion sort lexi
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && key.compareTo(arr[j]) < 0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
		for (String val : arr) {
			System.out.println(val);
		}
	}
}
