import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
//import java.util.Scanner;

//Java를 사용하고 있다면, Scanner와 System.out.println 
//대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException  {
//		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Deque<Integer> deque = new LinkedList<>();
//		int N = Integer.parseInt(sc.nextLine());
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
//			String line = sc.nextLine().trim();
			String line = br.readLine().trim();
			String[] arr = line.split(" ");
			
			// 
			if (arr.length == 2) {
				int value = Integer.parseInt(arr[1]);
				deque.offer(value);
			} else {
				switch(arr[0]) {
				case "front":
					// 큐의 가장 앞에 있는 정수를 출력
					// 정수가 없는 경우에는 -1을 출력
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.peekFirst()));
						bw.newLine();
					} else {
						bw.write(String.valueOf(-1));
						bw.newLine();
					}
					break;
				case "back":
					// 큐의 가장 뒤에 있는 정수를 출력
					// 정수가 없는 경우에는 -1을 출력
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.peekLast()));
						bw.newLine();
					} else {
						bw.write(String.valueOf(-1));
						bw.newLine();
					}
					break;
				case "size":
					// 큐에 들어있는 정수의 개수를 출력
					bw.write(String.valueOf(deque.size()));
					bw.newLine();
					break;
				case "empty":
					// 큐가 비어있으면 1, 아니면 0을 출력
					bw.write(String.valueOf(deque.isEmpty() ? 1 : 0));
					bw.newLine();
					break;
				case "pop":
					// 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력
					if (!deque.isEmpty()) {						
						bw.write(String.valueOf(deque.pop()));
						bw.newLine();
					} else {
						bw.write(String.valueOf(-1));
						bw.newLine();
					}
					break;
				}
			}
			
			
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
