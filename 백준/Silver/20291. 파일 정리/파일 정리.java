import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Map<String, Integer> extensions = new TreeMap<>();
		
		for (int i = 0; i < N; i++) {
			String file = sc.nextLine();
			String extension = file.substring(file.indexOf('.') + 1);
			
			extensions.put(extension, extensions.getOrDefault(extension, 0) + 1);
		}
		
		
		extensions.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});
	}
}
