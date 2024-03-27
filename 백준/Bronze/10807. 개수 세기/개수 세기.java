import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] myArr = sc.nextLine().split(" ");
        String v = sc.nextLine().trim();
        //for (int i = 0; i < myArr.length; i++) {
          //  System.out.println(myArr[i]);
        //}
        int answer = 0;
        for (String val : myArr) {
            if (val.equals(v)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}