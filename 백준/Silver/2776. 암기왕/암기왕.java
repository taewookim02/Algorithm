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
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			br.readLine();
			String[] note1Arr = br.readLine().split(" ");
			
			Set<String> note1Set = new HashSet<>();
			for (String str : note1Arr) {
				note1Set.add(str);
			}
			
			br.readLine();
			String[] note2Arr = br.readLine().split(" ");
			
			for (String str : note2Arr) {
				if (note1Set.contains(str)) {
					bw.write("1\n");
				} else {
					bw.write("0\n");
				}
			}
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
