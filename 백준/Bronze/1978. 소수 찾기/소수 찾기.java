import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int result = 0;
		for(int i = 0; i < T; i++) {
			int n = sc.nextInt();
			
			if (prime(n)) result++;
		}
		System.out.println(result);
	}

	static boolean prime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
}
