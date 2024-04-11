import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			set.add(sc.nextLine());
		}
		String[] arr = set.toArray(new String[set.size()]);

		// sort arr str.length asc, lexi asc
		sort(arr, 0, arr.length -1);
		for (String str : arr) {
			System.out.println(str);
		}
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
		while (i < n1 && j < n2) {
			if (L[i].length() < R[j].length() || (L[i].length() == R[j].length() && L[i].compareTo(R[j]) < 0)) {
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
