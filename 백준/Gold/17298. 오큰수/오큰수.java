import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Stack<Integer> idxSt = new Stack<>();
		
		int[] seq = new int[N];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < N; i++) {
			seq[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			while (!idxSt.isEmpty() && seq[idxSt.peek()] < seq[i]) {
				seq[idxSt.pop()] = seq[i];
			}
			idxSt.push(i);
		}
		
		while (!idxSt.isEmpty()) {
			seq[idxSt.pop()] = -1;
		}
		
		
		for (int val : seq) {
			sb.append(val + " ");
		}		
		
		System.out.println(sb.toString());
	}
}
