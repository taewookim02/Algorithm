import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 참가자 총점
		// 포함된 인덱스
		int[] sortedArr = new int[8];
		int[] arr = new int[8];

		for (int i = 0; i < sortedArr.length; i++) {
			arr[i] = sc.nextInt();
			sortedArr[i] = arr[i];
		}
		
		// insertion sort desc
		for (int i = 1; i < sortedArr.length; i++) {
			int key = sortedArr[i];
			int j = i - 1;
			
			while (j >= 0 && sortedArr[j] < key) {
				sortedArr[j + 1] = sortedArr[j];
				j--;
			}
			
			sortedArr[j + 1] = key;
		}
		
		// cal sum
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += sortedArr[i];
		}
		System.out.println(sum);
		
		
		// get idxArr 
		ArrayList<Integer> idxList = new ArrayList<Integer>();
		int[] copyOfRange = Arrays.copyOfRange(sortedArr, 0, 5);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < copyOfRange.length; j++) {
				if (arr[i] == copyOfRange[j]) {
					idxList.add(i + 1);
					continue;
				}
			}
		}
		
		for (int val : idxList) {
			System.out.print(val + " ");
		}
		
	}
}
