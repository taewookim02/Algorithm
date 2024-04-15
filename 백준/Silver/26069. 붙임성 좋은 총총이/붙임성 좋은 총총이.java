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

		Set<String> set = new HashSet<>();
		boolean isMetByChong = false;

		for (int i = 0; i < N; i++) {
			String[] ids = br.readLine().split(" ");

			String first = ids[0], second = ids[1];

			if (first.equals("ChongChong") || second.equals("ChongChong")) {
				isMetByChong = true;
				set.add(first);
				set.add(second);
			}
			if (isMetByChong && (set.contains(second) || set.contains(first))) {
				set.add(first);
				set.add(second);
			}

		}

		bw.write(String.valueOf(set.size()));
		bw.flush();
		bw.close();
		br.close();
	}
}
