import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		Stack<Character> L = new Stack<>();
		Stack<Character> R = new Stack<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = br.readLine();
		for (char ch : line.toCharArray()) {
			L.push(ch);
		}
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String command = br.readLine();

			if (command.equals("L")) {
				if (!L.isEmpty()) {
					R.push(L.pop());
				}
			} else if (command.equals("D")) {
				if (!R.isEmpty()) {
					L.push(R.pop());
				}
			} else if (command.equals("B")) {
				if (!L.isEmpty()) {
					L.pop();
				}
			} else {
				// P
				L.push(command.charAt(2));
			}

		}

		while (!L.isEmpty()) {
			R.push(L.pop());
		}

		while(!R.isEmpty()) {
			bw.write(R.pop());
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
