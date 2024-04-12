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
		int N = sc.nextInt();

		Map<Long, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			long num = sc.nextLong();
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		List<Entry<Long, Integer>> sortedEntries = map.entrySet().stream().sorted(Map.Entry
				.<Long, Integer>comparingByValue(Comparator.reverseOrder()).thenComparing(Map.Entry.comparingByKey()))
				.collect(Collectors.toList());

		for (Map.Entry<Long, Integer> entry : sortedEntries) {
			System.out.println(entry.getKey());
			break;
		}
	}
}
