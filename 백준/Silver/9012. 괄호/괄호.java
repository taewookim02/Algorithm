import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			Stack<Character> st = new Stack<>();
			boolean isProper = true;
			for (char ch : line.toCharArray()) {
				if (ch == '(') {
					st.push('(');
				} else if (ch == ')') {
					if (st.isEmpty()) {
						isProper = false;
					} else {
						st.pop();
					}
				}
			}
			if (st.size() > 0 || !isProper) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}
		br.close();

	}
}
