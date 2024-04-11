import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[N][2];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLine().split(" ");
		}

		sort(arr, 0, arr.length - 1);

		for (String[] query : arr) {
			System.out.println(query[0] + " " + query[1]);
		}

	}

	private static void merge(String[][] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;

		// temp arr
		String[][] L = new String[n1][2];
		String[][] R = new String[n2][2];

		// put in data
		for (int i = 0; i < n1; i++) {
			L[i][0] = arr[l + i][0];
			L[i][1] = arr[l + i][1];
		}
		for (int j = 0; j < n2; j++) {
			R[j][0] = arr[m + 1 + j][0];
			R[j][1] = arr[m + 1 + j][1];
		}

		// init idxes
		int i = 0, j = 0;
		int k = l;

		// while
//		while (i < n1 && j < n2) {
//			if (Integer.parseInt(L[i][0]) < Integer.parseInt(R[j][0])
//					|| (L[i][0].equals(R[j][0]) && L[i][1].compareTo(R[j][1]) > 0)) {
//				arr[k] = L[i];
//				i++;
//			} else {
//				arr[k] = R[j];
//				j++;
//			}
//			k++;
//		}
		while (i < n1 && j < n2) {
		    if (Integer.parseInt(L[i][0]) <= Integer.parseInt(R[j][0])) {
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

			// merge 2 halves
			merge(arr, l, m, r);
		}
	}
}
