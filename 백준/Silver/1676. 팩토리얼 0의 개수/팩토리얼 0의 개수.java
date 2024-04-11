import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
//		BigInteger result = factorial(BigInteger.valueOf(N));
//		String resultStr = result.toString();

		int count = 0;
		
//		for (int i = resultStr.length() - 1; i >= 0; i--) {
//			if (resultStr.charAt(i) == '0') {
//				count++;
//			} else {
//				break;
//			}
//		}
//		for (int i = 5; i <= N; i*= 5) {
//			count += N / i;
//		}
		BigInteger result = BigInteger.valueOf(1);
		for (int i = 1; i <= N; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		String resultStr = result.toString();
		for (int i = resultStr.length() - 1; i >= 0; i--) {
			if (resultStr.charAt(i) == '0') {
				count++;
			} else {
				break;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	}
	
	
	private static BigInteger factorial(BigInteger n) {
		if (n.compareTo(BigInteger.valueOf(1)) == 0) {
			return BigInteger.valueOf(1);
		}
		
		return factorial(n.subtract(BigInteger.valueOf(1))).multiply(n);
	}

}
