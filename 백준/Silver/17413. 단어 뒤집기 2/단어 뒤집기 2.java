import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		boolean isInsideTag = false;
		for (char ch : line.toCharArray()) {
			if (ch == '<') {
				
				// 
				while(!st.isEmpty()) {
					sb.append(st.pop());
				}
				sb.append(ch);
				isInsideTag = true;
			} else if (ch == '>') {
				sb.append(ch);
				isInsideTag = false;
			} else if (isInsideTag) {
				sb.append(ch);
			} else if(ch == ' ') {
				while (!st.isEmpty()) {
					sb.append(st.pop());
				}
				sb.append(' ');
			} else {
				st.push(ch);
			}
		}
		
		while (!st.isEmpty()) {
			sb.append(st.pop());
		}
		
		System.out.println(sb.toString());
	}

}
