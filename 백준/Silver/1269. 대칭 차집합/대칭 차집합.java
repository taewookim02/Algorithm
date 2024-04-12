import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		String[] A = br.readLine().split(" ");
		String[] B = br.readLine().split(" ");
		Set<Integer> setA = new HashSet<>();
		Set<Integer> setB = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			setA.add(Integer.parseInt(A[i]));
		}
		for (int i = 0; i < B.length; i++) {
			setB.add(Integer.parseInt(B[i]));
		}

		int result = 0;
		for (int val : setA) {
			if (!setB.contains(val)) {
				result++;
			}
		}
		for (int val : setB) {
			if (!setA.contains(val)) {
				result++;
			}
		}
		System.out.println(result);

		br.close();
	}
}
