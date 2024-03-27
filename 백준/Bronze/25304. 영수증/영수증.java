import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = Integer.parseInt(sc.nextLine());
        int num = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 0; i < num; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();
            result += (price * quantity);
        }
        System.out.println(total == result ? "Yes" : "No");
    }
}