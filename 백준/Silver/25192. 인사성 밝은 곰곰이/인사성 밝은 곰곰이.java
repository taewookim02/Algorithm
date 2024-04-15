import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int count = 0;
		Set<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			if (line.equals("ENTER")) {
				count += set.size();
				set.clear();
			} else {
				set.add(line);
			}
		}
		count += set.size();

		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
}
