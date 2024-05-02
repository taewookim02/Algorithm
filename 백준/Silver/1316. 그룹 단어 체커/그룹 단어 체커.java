import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());

		int count = 0;

		for (int i = 0; i < N; i++) {
			String word = sc.nextLine();
			boolean isGroupWord = true;
			char lastChar = '\0';
			Set<Character> seen = new HashSet<>();
			
			for (int j = 0; j < word.length(); j++) {
				char currChar = word.charAt(j); 
				
				if(currChar != lastChar) {
					if (seen.contains(currChar)) {
						isGroupWord = false;
						break;
					}
					seen.add(lastChar);
				}
				
				lastChar = currChar;
			}

			if (isGroupWord) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
