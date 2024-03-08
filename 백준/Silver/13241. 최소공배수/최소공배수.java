import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long a1 = a, b1 = b;
        while (b1 != 0) {
            long r = a1 % b1;
            a1 = b1;
            b1 = r;
        }
        
        long lcm = (a * b) / a1;
        System.out.println(lcm);
    }
    
}