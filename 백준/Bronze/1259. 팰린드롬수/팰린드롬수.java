import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String numbers = sc.nextLine();
			if (numbers.equals("0")) {
				break;
			}

			if (numbers.length() % 2 == 0) {
				// even num
				String start = numbers.substring(0, numbers.length() / 2);
				String end = numbers.substring(numbers.length() / 2);
				if (start.equals(reverse(end))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}

			} else {
				// odd num
				String start = numbers.substring(0, numbers.length() / 2 + 1);
				String end = numbers.substring(numbers.length() / 2);
				if (start.equals(reverse(end))) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}

	private static String reverse(String str) {
		if (str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
