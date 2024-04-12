import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String[] split = br.readLine().split(" ");
			String name = split[0];
			String status = split[1];
			if (status.equals("enter")) {
				map.put(name, map.getOrDefault(name, 0) + 1);
			} else {
				map.put(name, map.getOrDefault(name, 0) - 1);
			}
		}

		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 0) {
				list.add(entry);
			}
		}

		// sort desc
		list.sort((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()));

		for (Map.Entry<String, Integer> entry : list) {
			bw.write(entry.getKey());
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
