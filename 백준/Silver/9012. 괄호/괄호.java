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
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			Stack<Character> st = new Stack<>();
			boolean isOk = true;
			
			for (char ch : line.toCharArray()) {
				if (ch == '(') {
					st.push(ch);
				}
				if (ch == ')') {
					if (st.size() > 0) {						
						st.pop();
					} else {
						isOk = false;
						break;
					}
				}
			}
			
			if (!isOk || st.size() > 0) {
				bw.write("NO");
				bw.newLine();
			} else {
				bw.write("YES");
				bw.newLine();
			}
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
