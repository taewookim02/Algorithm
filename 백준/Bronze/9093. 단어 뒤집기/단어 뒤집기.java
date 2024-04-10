import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		
		for (int i = 0; i < T; i++) {
			String line = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			Stack<Character> st = new Stack<>();
			
			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) != ' ') {					
					st.push(line.charAt(j));
				} else {
					while (!st.isEmpty()) {
						sb.append(st.pop());
					}
					sb.append(' ');
				}
			}
			// remainders
			while (!st.isEmpty()) {
				sb.append(st.pop());
			}
			System.out.println(sb.toString());
		}
	}
	
}
