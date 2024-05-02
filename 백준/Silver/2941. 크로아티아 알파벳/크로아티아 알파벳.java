import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] arr = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		int count = line.length();
		
		for (String cro : arr) {
			if (line.contains(cro)) {
				line = line.replaceAll(cro, "1");
			}
		}
		
		
		System.out.println(line.length());
 	}

}
