import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");

		int[] myArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			myArr[i] = Integer.parseInt(arr[i]);
		}
		
		for (int i = 0; i < myArr.length; i++) {
			int idxMin = i;
			for (int j = i + 1; j < myArr.length; j++) {
				if (myArr[j] > myArr[idxMin]) {
					idxMin = j;
				}
			}
            
            int temp = myArr[idxMin]; 
            myArr[idxMin] = myArr[i]; 
            myArr[i] = temp;
		}
		
		for (int val : myArr) {
			System.out.print(val);
		}
		
	}
}
