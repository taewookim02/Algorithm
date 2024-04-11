import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] line = br.readLine().split(" ");
		sort(line, 0, line.length - 1);
		bw.write(line[1]);
		bw.newLine();
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void merge(String[] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;
		
		// temp arr
		String[] L = new String[n1];
		String[] R = new String[n2];
		
		// put in data
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		
		// init idxes
		int i = 0, j = 0;
		int k = l;
		
		// while
		while(i < n1 && j < n2) {
			if (Integer.parseInt(L[i]) >= Integer.parseInt(R[j])) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// remainders
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	private static void sort(String[] arr, int l, int r) {
		if (l < r) {
			// get middle
			int m = l + (r - l) / 2;
			
			// sort 2 halves
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			// merge 2 halves
			merge(arr, l, m, r);
		}
	}
}
