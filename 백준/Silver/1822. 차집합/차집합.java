import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		br.readLine();
		String[] A = br.readLine().split(" ");
		String[] B = br.readLine().split(" ");

		Set<String> setA = new HashSet<>();
		Set<String> setB = new HashSet<>();

		for (String str : A) {
			setA.add(str);
		}
		for (String str : B) {
			setB.add(str);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (String str : setA) {
			if (setB.contains(str)) {
				continue;
			} else {
				list.add(Integer.parseInt(str));
			}
		}

		// sort list asc
		list.sort((val1, val2) -> {
			return val1 - val2;
		});
		bw.write(String.valueOf(list.size()));
		bw.newLine();
		for (int val : list) {
			bw.write(String.valueOf(val) + " ");
		}

		bw.flush();
		bw.close();
		br.close();
	}
}
