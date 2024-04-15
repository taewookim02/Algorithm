import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> inMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String carNum = br.readLine();
			inMap.put(carNum, i);
		}
		
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			arr[i] = inMap.get(input);
		}
		int result= 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					result++;
					break;
					
				}
			}
		}
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		br.close();
	}
}
