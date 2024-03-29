import java.util.Scanner;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k; i++) {
            int val = sc.nextInt();
            if (val == 0) {
                st.pop();
            } else {
                st.push(val);
            }
        }
        int sum = 0;
        for (int val : st) {
            sum += val;
        }
        System.out.println(sum);
        
    }
}