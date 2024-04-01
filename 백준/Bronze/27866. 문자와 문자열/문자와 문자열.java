import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int idx = Integer.parseInt(sc.nextLine());
        System.out.println(str.charAt(idx - 1));
    }
}