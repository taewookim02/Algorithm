import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String bookName = sc.nextLine();
			map.put(bookName, map.getOrDefault(bookName, 0) + 1);
		}

		int max = -1;
		String name = "";

		List<Entry<String, Integer>> sortedEntries = map.entrySet().stream().sorted(Map.Entry
				.<String, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toList());

		for (Map.Entry<String, Integer> entry : sortedEntries) {
			System.out.println(entry.getKey());
			break;
		}

	}
}
