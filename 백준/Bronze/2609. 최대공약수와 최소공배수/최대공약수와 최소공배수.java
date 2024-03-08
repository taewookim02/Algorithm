import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        
        // least commmon multiple
        int lcm = a * b / gcd(a, b), gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(lcm);
        
    }
    
    static private int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}