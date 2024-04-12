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

		int numCards = Integer.parseInt(br.readLine());
		String[] cardArr = br.readLine().split(" ");
		// put into map and increment count
		Map<Integer, Integer> map = new HashMap<>();
		for (String val : cardArr) {
			map.put(Integer.parseInt(val), map.getOrDefault(Integer.parseInt(val), 0) + 1);
		}

		int targetCount = Integer.parseInt(br.readLine());
		String[] targetArr = br.readLine().split(" ");

		for (String val : targetArr) {
			bw.write(String.valueOf(map.getOrDefault(Integer.parseInt(val), 0) + " "));
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
