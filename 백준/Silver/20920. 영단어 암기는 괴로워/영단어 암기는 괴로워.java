import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]), M = Integer.parseInt(NM[1]);
		
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String word = br.readLine();

			if (word.length() >= M) {
				map.put(word, map.getOrDefault(word, 0) + 1);
			}
		}
		
		
		// sort map by value desc, key.length() desc, key.lexi asc

		// put in list
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		list.sort((entry1, entry2) -> {
			int valueCompare = entry2.getValue().compareTo(entry1.getValue());
			if (valueCompare != 0) {
				return valueCompare;
			}
			
			// length desc
			int lengthCompare = Integer.compare(entry2.getKey().length(), entry1.getKey().length());
			if (lengthCompare != 0) {
				return lengthCompare;
			}
			
			// lexi asc
			return entry1.getKey().compareTo(entry2.getKey());
		});
		
		
		for (Map.Entry<String, Integer> entry : list) {
			bw.write(entry.getKey());
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
