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
		
		String[] split = br.readLine().split(" ");
		int N = Integer.parseInt(split[0]), M = Integer.parseInt(split[1]);
		
		Map<String, String> passwords = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			passwords.put(line[0], line[1]);
		}
		
		for (int j = 0; j < M; j++) {
			String id = br.readLine();
			bw.write(passwords.get(id));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
