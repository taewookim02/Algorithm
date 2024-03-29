import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Queue<Integer> que = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			que.offer(i);
		}

		int result = 0;
		while (!que.isEmpty() && que.size() >= 2) {
			int first = que.poll();
			int second = que.poll();
			que.offer(second);
		}
		result = que.poll();
		bw.write(String.valueOf(result));
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
		
	}
}
