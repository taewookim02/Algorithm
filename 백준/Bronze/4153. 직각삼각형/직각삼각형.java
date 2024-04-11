import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String[] split = sc.nextLine().split(" ");
			if (split[0].equals("0") && split[1].equals("0") && split[2].equals("0")) {
				break;
			}
			
			// selection sort current split
			for (int i = 0; i < split.length; i++) {
				int minIdx = i;
				
				for (int j = i + 1; j < split.length; j++) {
					if (Integer.parseInt(split[minIdx]) > Integer.parseInt(split[j])) {
						minIdx = j;
					}
				}
				String temp = split[minIdx];
				split[minIdx] = split[i];
				split[i] = temp;
			}
			
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[1]);
			int c = Integer.parseInt(split[2]);
			
			if (((a * a) + (b * b)) == c * c) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}
