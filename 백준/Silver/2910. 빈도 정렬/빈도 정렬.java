import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		String[] NC = br.readLine().split(" ");
		br.readLine();

		String[] arr = br.readLine().split(" ");
		Map<String, Integer> freqMap = new HashMap<>();
		Map<String, Integer> appearanceMap = new HashMap<>();
		int idx = 0;
		for (String str : arr) {
			freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
			appearanceMap.putIfAbsent(str, idx);
			idx++;
		}

		// put in list
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(freqMap.entrySet());

		// sort
		entries.sort((entry1, entry2) -> {
			if (entry1.getValue() == entry2.getValue()) {
				return appearanceMap.get(entry1.getKey()) - appearanceMap.get(entry2.getKey());
			}

			return entry2.getValue() - entry1.getValue();
		});

		// print
		for (Map.Entry<String, Integer> entry : entries) {
			for (int i = 0; i < entry.getValue(); i++) {
				bw.write(entry.getKey() + " ");
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
