import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt();
		
		primeList(M, N);
	}
	
	static void primeList(int M, int N) {
		int[] prime = new int[N + 1];
		for (int i = 2; i <= N; i++) {
			prime[i] = i;
		}

		for (int i = 2; i<= N; i++) {
			if (prime[i] == 0) {
				continue;
			}
			
			for (int j = i + i; j <= N; j+= i) {
				prime[j] = 0;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = M; i < prime.length; i++) {
			if (prime[i] != 0) {
				sb.append(prime[i] + "\n");
			}
		}
		
		System.out.println(sb.toString().trim());
	}
}
