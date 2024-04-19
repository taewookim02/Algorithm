import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<>();
		int temp = 1;
		StringBuilder sb = new StringBuilder();
		boolean isErr = false;
		
		for (int i = 0; i < T; i++) {
			// 
			int curr = Integer.parseInt(br.readLine());
			for ( ; temp <= curr; temp++) {
				st.push(temp);
				sb.append("+\n");
			}
			if (st.peek() == curr) {
				st.pop();
				sb.append("-\n");
			} else {
				isErr = true;
			}
			
		}
		if (isErr) {
			System.out.println("NO");
		} else {
			System.out.println(sb.toString());
		}
	}
}
