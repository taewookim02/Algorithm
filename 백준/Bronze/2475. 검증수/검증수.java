import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int result = 0;
		
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			
			result += arr[i]*arr[i];
		}
		
		System.out.println(result % 10);
	}

}
