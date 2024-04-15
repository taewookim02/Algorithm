import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> map = new TreeMap<>();
		int sum = 0;
		
		while (true) {
			String tree = br.readLine();			
			if (tree == null || tree.equals("")) {
				break;
			}
			map.put(tree, map.getOrDefault(tree, 0) + 1);			
		}

		// get sum
		for (int val : map.values()) {
			sum += val;
		}
		
		// print
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			bw.write(entry.getKey() + " " + String.format("%.4f", (double)entry.getValue() / sum * 100));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
