import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine()); // test case
		for (int i = 0; i < T; i++) {
			int answer = 0;
			Queue<Integer> que = new LinkedList<>();
			String[] nmArr = sc.nextLine().split(" ");
			String[] docArr = sc.nextLine().split(" ");
			int numDoc = Integer.parseInt(nmArr[0]); // 문서 개수
			int targetIdx = Integer.parseInt(nmArr[1]); // 타겟의 인덱스
			int[] intDocArr = new int[numDoc];
			
			
			for (int j = 0; j < numDoc; j++) {
				intDocArr[j] = Integer.parseInt(docArr[j]);
				que.offer(j);
			}
			
			while (!que.isEmpty()) {
				// 타겟의 인덱스가 몇번째로 실행됨?
				int curIdx = que.poll();
				boolean isMaxPrio = true;
				
				for (int idx : que) {
					if (intDocArr[curIdx] < intDocArr[idx]) {
						isMaxPrio = false;
						break;
					}
				}
				if (isMaxPrio) {
					answer++;
					if (curIdx == targetIdx) {
						System.out.println(answer);
						break;
					}
				} else {
					que.offer(curIdx);
				}
			}

		}
	}
}
