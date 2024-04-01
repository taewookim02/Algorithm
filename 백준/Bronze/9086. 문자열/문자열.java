import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            String line = sc.nextLine();
            if (line.length() == 1) {
                System.out.print(line);
                System.out.print(line);
            } else {
                System.out.print("" + line.charAt(0) + line.charAt(line.length() - 1));
            }
            System.out.println();
            
        }
    }
}