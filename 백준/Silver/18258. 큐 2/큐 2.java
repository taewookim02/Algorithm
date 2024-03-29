import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Deque<Integer> deque = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String line = br.readLine().trim();
			String[] arr = line.split(" ");

			if (arr.length > 1) {
				int val = Integer.parseInt(arr[1]);
				deque.offer(val);
			} else {
				switch (line) {
				case "front":
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.peek()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.newLine();
					break;
				case "back":
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.peekLast()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.newLine();
					break;
				case "size":
					bw.write(String.valueOf(deque.size()));
					bw.newLine();
					break;
				case "empty":
					bw.write(String.valueOf(deque.isEmpty() ? 1 : 0));
					bw.newLine();
					break;
				case "pop":
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.pop()));
					} else {
						bw.write(String.valueOf(-1));
					}
					bw.newLine();
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
