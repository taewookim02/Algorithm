import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wArr = new int[10]; 
		int[] kArr = new int[10];
		for (int i = 0; i < wArr.length; i++) {
			wArr[i] = sc.nextInt();
		}
		for (int i = 0; i < kArr.length; i++) {
			kArr[i] = sc.nextInt();
		}
		
		// insertion sort wArr
		for (int i = 1; i < wArr.length; i++) {
			int key = wArr[i];
			int j = i - 1;
			
			// sort desc
			while (j >= 0 && wArr[j] < key) {
				wArr[j + 1] = wArr[j];
				j--;
			}
			
			wArr[j + 1] = key;
		}
		
		
		// selection sort kArr
		for (int i = 0; i < kArr.length - 1; i++) {
			int maxIdx = i;
			
			for (int j = i + 1; j < kArr.length; j++) {
				// sort desc
				if (kArr[j] > kArr[maxIdx]) {
					maxIdx = j;
				}
			}
			
			int temp = kArr[maxIdx];
			kArr[maxIdx] = kArr[i];
			kArr[i] = temp;
		}

		
		
		
		// bubble sort kArr
//		for (int i = 0; i < kArr.length - 1; i++) {
//			for (int j = 0; j < kArr.length - 1 - i; j++) {
//				if (kArr[j] > kArr[j + 1]) {
//					int temp = kArr[j];
//					kArr[j] = kArr[j + 1];
//					kArr[j + 1] = temp;
//				}
//			}
//		}

		int wSum = 0, kSum = 0;
		for (int i = 0; i < 3; i++) {
			wSum += wArr[i];
			kSum += kArr[i];
		}
		System.out.println(wSum + " " + kSum);
	}
}
