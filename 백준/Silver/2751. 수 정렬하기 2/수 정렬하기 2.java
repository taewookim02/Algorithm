import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		
		// put in data
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// sort
		sort(arr, 0, arr.length - 1);
				
		for (int val: arr) {
			bw.write(String.valueOf(val));
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	private static void merge(int[] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;
		
		// temp arr
		int[] L = new int[n1];
		int[] R = new int[n2];
		
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
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// remainder
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	
	private static void sort(int[] arr, int l, int r) {
		if (l < r) {
			// get middle
			int m = l + (r - l) / 2;
			
			// sort 2 halves
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			// merge
			merge(arr, l, m, r);
		}
	}
}
