import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			
			if (line.length > 1) {
				st.push(Integer.parseInt(line[1]));
			}
			
			switch (line[0]) {
			case "top":
//				위에 있는 정수를 출력
//				없는 경우에는 -1을 출력
				if (!st.isEmpty()) {
					bw.write(String.valueOf(st.peek()));
					bw.newLine();
				} else {
					bw.write(String.valueOf(-1));
					bw.newLine();
				}
				break;
			case "size":
//				정수의 개수를 출력	
				bw.write(String.valueOf(st.size()));
				bw.newLine();
				break;
			case "empty":
//				비어있으면 1, 아니면 0을 출력
				if (!st.isEmpty()) {
					bw.write(String.valueOf(0));
					bw.newLine();
				} else {
					bw.write(String.valueOf(1));
					bw.newLine();
				}
				break;
			case "pop":
//				정수를 빼고, 그 수를 출력한다
//				없는 경우에는 -1
				if (!st.isEmpty()) {
					bw.write(String.valueOf(st.pop()));
					bw.newLine();
				} else {
					bw.write(String.valueOf(-1));
					bw.newLine();
				}
				break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
