import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int wholeLen = N - 1;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N * 2; i++) {
			String stars = "";

			if (i % 2 == 1) {
//				stars = "*".repeat(i);
				stars = repeat("*", i);
				int blankCount = ++wholeLen - stars.length();
//				sb.append(" ".repeat(blankCount));
				sb.append(repeat(" ", blankCount));
				sb.append(stars).append("\n");
			}
		}

		int blankCount = 1;
		for (int i = N * 2 - 2; i >= 1; i--) {
			String stars = "";
			if (i % 2 == 1) {
//				stars = "*".repeat(i);
				stars = repeat("*", i);
//				sb.append(" ".repeat(blankCount++));
				sb.append(repeat(" ", blankCount++));
				sb.append(stars).append("\n");
			}
		}

		
		System.out.println(sb.toString());

	}
	
	
	private static String repeat(String str, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(str);
		}

		return sb.toString();
	}
}
