import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt(), N = sc.nextInt();
		
		sieve(M, N);
	}
	
	static void sieve(int M, int N) {
		boolean[] check = new boolean[N + 1];
		
		check[0] = check[1] = true;
		
		for (int i = 2; i <= N; i++) {
			if (check[i] == false) {
				for (int j = i + i; j <= N; j += i ) {
					check[j] = true;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 2; i <= N; i++) {
			if (!check[i] && i >= M) {
				sb.append(i + "\n");
			}
		}
		
		System.out.println(sb.toString().trim());
	}
	
}
