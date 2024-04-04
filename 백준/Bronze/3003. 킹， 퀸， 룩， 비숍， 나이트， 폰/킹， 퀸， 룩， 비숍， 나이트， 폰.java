import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다.
		int[] corrArr = { 1, 1, 2, 2, 2, 8 };
		int[] inputArr = { sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt() };

		for (int i = 0; i < inputArr.length; i++) {
			System.out.print(corrArr[i] - inputArr[i] + " ");
		}
	}
}
