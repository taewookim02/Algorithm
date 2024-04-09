import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]; 
		}
		
		
		boolean isFound = false;
		int iIdx = 0;
		int jIdx = 0;
		// find 2 imposters
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j  < arr.length; j++) {
				if (sum - (arr[i] + arr[j]) == 100) {
					isFound = true;
					iIdx = i;
					jIdx = j;
					break;
				}
			}
			if (isFound) break;
		}
		
		ArrayList<Integer> resultList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (i == iIdx || i == jIdx) {
				continue;
			}
			
			resultList.add(arr[i]);
		}
		
		int[] sortedArr = new int[7];
		for (int i = 0; i < sortedArr.length; i++) {
			sortedArr[i] = resultList.get(i);
		}
		
		// selection sort
		for (int i = 0; i < sortedArr.length - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < sortedArr.length; j++) {
				if (sortedArr[j] < sortedArr[minIdx]) {
					minIdx = j;
				}
				
			}
			int temp = sortedArr[minIdx];
			sortedArr[minIdx] = sortedArr[i];
			sortedArr[i] = temp;
		}
		
		for (int val : sortedArr) {
			System.out.println(val);
		}
	}
}
