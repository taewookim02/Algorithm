import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] points = new int[N][2];
		for (int i = 0; i < N; i++) {
			points[i][0] = sc.nextInt();
			points[i][1] = sc.nextInt();
		}
		
		sort(points, 0, points.length - 1);
		
		for (int[] point : points) {
			System.out.println(point[0] + " " + point[1]);
		}

	}

	private static void merge(int[][] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;

		// temp arr
		int[][] L = new int[n1][2];
		int[][] R = new int[n2][2];

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

		while (i < n1 && j < n2) {
			if (L[i][1] < R[j][1] || (L[i][1] == R[j][1] && L[i][0] <= R[j][0])) {
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
	
	private static void sort(int[][] arr, int l, int r) {
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
