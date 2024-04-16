import java.util.Scanner;

class CharStack {
	private int top;
	private int size;
	private char[] stack;

	public CharStack(int size) {
		this.size = size;
		top = -1;
		stack = new char[size];
	}

	public void push(char item) {
		stack[++top] = item;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public char pop() {
		if (isEmpty()) {
			return '\0';
		} else {
			char item = stack[top];
			stack[top--] = '\0';
			return item;
		}
	}
}


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			String line = sc.nextLine();
			CharStack stack = new CharStack(line.length());
			StringBuilder sb = new StringBuilder();
			for (char ch : line.toCharArray()) {
				if (ch != ' ') {
					stack.push(ch);
				} else {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
				}
			}
            while(!stack.isEmpty()) {
				sb.append(stack.pop());
			}
			System.out.println(sb.toString());
		}
		sc.close();
	}
}
