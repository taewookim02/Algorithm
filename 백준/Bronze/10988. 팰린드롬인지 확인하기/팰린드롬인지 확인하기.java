import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int m = word.length() % 2 == 0 ? word.length() / 2 : word.length() / 2 + 1;

		String l = word.substring(0, m);
		String r = word.substring(word.length() / 2);
		
		if (l.equals(reverse(r))) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	private static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
