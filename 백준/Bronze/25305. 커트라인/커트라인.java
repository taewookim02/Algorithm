import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            // get input and put into arr
            arr[i] = sc.nextInt();
        }
        
        // insertion sort
        for (int i = 1; i < N; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        
        System.out.println(arr[N - k]);
    }
}