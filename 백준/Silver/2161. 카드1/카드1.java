import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Queue<Integer> que = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}

		while (que.size() > 1) {
			int f = que.poll();
			int s = que.poll();
			list.add(f);
			que.offer(s);
		}
		list.add(que.poll());
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				sb.append(list.get(i));
			} else {
				sb.append(list.get(i));
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
		
	}
}
