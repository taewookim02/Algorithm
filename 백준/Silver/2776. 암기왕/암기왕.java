import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			br.readLine();
			String[] note1Arr = br.readLine().split(" ");
			Map<String, Integer> note1Map = new HashMap<>();
			
			for (String str : note1Arr) {
				note1Map.put(str, note1Map.getOrDefault(str, 0) + 1);
			}

			br.readLine();
			String[] note2Arr = br.readLine().split(" ");
			
			for (String str : note2Arr) {
				if (note1Map.containsKey(str)) {
					bw.write(String.valueOf(1));
					bw.newLine();
				} else {
					bw.write(String.valueOf(0));
					bw.newLine();
				}
			}
		}
		
		bw.flush();
		bw.close();
		br.close();

	}
}
