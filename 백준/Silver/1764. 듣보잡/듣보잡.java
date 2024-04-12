import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] NM = br.readLine().split(" ");
		int total = Integer.parseInt(NM[0]) + Integer.parseInt(NM[1]);

		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < total; i++) {
			String name = br.readLine();
			map.put(name, map.getOrDefault(name, 0) + 1);
		}

		ArrayList<Entry<String, Integer>> list = new ArrayList<>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				list.add(entry);
			}
		}

		// sort list by key asc
		list.sort((entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));

		System.out.println(list.size());
		for (Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey());
		}
	}
}
