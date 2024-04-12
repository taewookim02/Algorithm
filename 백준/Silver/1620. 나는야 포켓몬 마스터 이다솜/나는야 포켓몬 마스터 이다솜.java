import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]), M = Integer.parseInt(NM[1]);
		Map<Integer, String> idToNameMap = new HashMap<>();
		Map<String, Integer> nameToIdMap = new HashMap<>();

		// put in data
		for (int i = 1; i <= N; i++) {
			String pokeName = br.readLine();
			idToNameMap.put(i, pokeName);
			nameToIdMap.put(pokeName, i);
		}

		// query
		for (int i = 0; i < M; i++) {
			String line = br.readLine();
			if (Character.isDigit(line.charAt(0))) {
				int num = Integer.parseInt(line);
				bw.write(String.valueOf(idToNameMap.get(num)));
				bw.newLine();
			} else {
				bw.write(String.valueOf(nameToIdMap.get(line)));
				bw.newLine();
			}

		}

		bw.flush();
		bw.close();
		br.close();
	}
}
