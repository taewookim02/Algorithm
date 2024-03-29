import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 1; i <= N; i++) {
            que.offer(i);
        }
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            for (int i = 1; i <= K; i++) {
               if (i == K) {
                    list.add(que.poll());
               } else {
                    que.offer(que.poll());
               }
            }
            
            if (que.size() == 0) {
                break;
            }   
        }
        
        String result = "";
        
        for (int val : list) {
            result += val + ", ";
        }
        
        result = result.trim();
        result = result.substring(0, result.length() - 1);
        result = "<" + result + ">";
        System.out.println(result);
        
    }
}