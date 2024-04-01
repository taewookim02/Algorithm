import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] split = sc.nextLine().split(" ");
		int N = Integer.parseInt(split[0]);
		int K = Integer.parseInt(split[1]);
		Queue<Integer> que = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}
		
		int idx = 0;
		while (!que.isEmpty()) {
			for (int i = 1; i <= K; i++) {
				if (i == K) {
					list.add(que.poll());
				} else {
					que.offer(que.poll());
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		
		sb.append("<");
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			if (i != list.size() - 1) {
				sb.append(", ");
			}
		}
		sb.append(">");
		
		
		System.out.println(sb.toString());
	}
	
}
