import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] split = sc.nextLine().split(" ");
		Queue<Integer> que = new LinkedList<>();
		int[] arr = new int[split.length];
		int[] fedTimes = new int[N];
		int answer = 0;

		for (int i = 0; i < split.length; i++) {
			arr[i] = Integer.parseInt(split[i]);
			que.offer(i);
		}
		while (!que.isEmpty()) {
			answer++;
			int curIdx = que.poll();

			arr[curIdx]--;

			if (arr[curIdx] == 0) {
				fedTimes[curIdx] = answer;
			} else {
				que.offer(curIdx);
			}

		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < fedTimes.length; i++) {
			if (i == fedTimes.length - 1) {
				sb.append(fedTimes[i]);
			} else {
				sb.append(fedTimes[i]);
				sb.append(" ");
			}
		}
		
		System.out.println(sb);

	}

}
