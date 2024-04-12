import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		Set<String> set = new HashSet<>();

		for (int i = 0; i < word.length(); i++) {
			for (int j = i + 1; j <= word.length(); j++) {
				String substring = word.substring(i, j);
				set.add(substring);
			}
		}
		System.out.println(set.size());
	}
}
