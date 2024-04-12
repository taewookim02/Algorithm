import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] NM = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]), M = Integer.parseInt(NM[1]);
		Map<String, Integer> map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			map.put(str, map.getOrDefault(str, 0) + 1);	
		}
		
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			String line = br.readLine();
			if (map.get(line) != null) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
