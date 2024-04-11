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

		String[][] arr = new String[N][4];
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().split(" ");
		}

		sort(arr, 0, arr.length - 1);

		for (String[] query : arr) {
			bw.write(query[0]);
			bw.newLine();
		}

		bw.flush();
		bw.close();
		br.close();
	}

	private static void merge(String[][] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;

		// temp arr
		String[][] L = new String[n1][4];
		String[][] R = new String[n2][4];

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
			int koreanL = Integer.parseInt(L[i][1]);
			int koreanR = Integer.parseInt(R[j][1]);
			int englishL = Integer.parseInt(L[i][2]);
			int englishR = Integer.parseInt(R[j][2]);
			int mathL = Integer.parseInt(L[i][3]);
			int mathR = Integer.parseInt(R[j][3]);

			// 국어 desc, 영어 asc, 수학 desc
			if (koreanL > koreanR || (koreanL == koreanR && englishL < englishR)
					|| (koreanL == koreanR && englishL == englishR && mathL > mathR) || (koreanL == koreanR
							&& englishL == englishR && mathL == mathR && L[i][0].compareTo(R[j][0]) < 0)) {
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

	private static void sort(String[][] arr, int l, int r) {
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
