import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		int numCards = Integer.parseInt(br.readLine());
		br.readLine();
		String[] cards = br.readLine().split(" ");
		
		Map<String, Integer> map = new HashMap<>();
		for (String card : cards) {
			map.put(card, map.getOrDefault(card, 0) + 1);
		}
		
//		int targetNum = Integer.parseInt(br.readLine());
		br.readLine();
		String[] targetCards = br.readLine().split(" ");
		for (String target : targetCards) {
			bw.write(map.getOrDefault(target, 0) + " ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
