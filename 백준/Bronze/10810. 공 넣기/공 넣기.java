import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(), m = sc.nextInt();
        
        int[] myArr = new int[n]; 
        
        for (int idx = 0; idx < m; idx++) {
            int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
            for (i = i - 1; i <= j - 1; i++) {
                myArr[i] = k;
            }
        }
        for (int val : myArr) {
            System.out.print(val + " ");
        }
    }
}