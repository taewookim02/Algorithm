import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.println(lcm(sc.nextInt(), sc.nextInt()));
		}
	}
	
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
	
	static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
}
