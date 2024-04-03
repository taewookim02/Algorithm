import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		Stack<Character> st = new Stack<>();
		int result = 0;
		for (int i = 0; i < line.length(); i++) {
			char prevChar = 'a';
			if (i != 0) {
				prevChar = line.charAt(i - 1);
			}
			char curChar = line.charAt(i);

			if (curChar == '(') {
				st.push('(');
			} else {
				st.pop();
				// 닫는 괄호일 때
				// 레이저일 때 (전 문자가 '(' 일 때)
				// 스택 사이즈 +
				if (prevChar == '(') {
					result += st.size();
				}
				// 파이프 끝일 때 (전 문자가 ')' 일 때)
				// ++
				if (prevChar == ')') {
					result++;
				}

			}
		}
		
		System.out.println(result);
	}
	
}
