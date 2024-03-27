import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int byteNum = sc.nextInt();
        int times = byteNum / 4;
        
       for (int i = 0; i < times; i++) {
           System.out.print("long ");
       }
        
       System.out.print("int");
    }
    
}