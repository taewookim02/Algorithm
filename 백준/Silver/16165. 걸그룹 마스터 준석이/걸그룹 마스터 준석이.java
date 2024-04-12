import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] NM = sc.nextLine().split(" ");
		int numGroups = Integer.parseInt(NM[0]), numQuestions = Integer.parseInt(NM[1]);
		
		Map<String, String[]> map = new HashMap<>();
		
		for (int i = 0; i < numGroups; i++) {
			// first line = girlgroup name
			String groupName = sc.nextLine();
			
			// second line = num members
			int numMembers = Integer.parseInt(sc.nextLine());
			
			String[] memberArr = new String[numMembers]; 
			// 3rd line~ = member names
			for (int j = 0; j < numMembers; j++) {
				memberArr[j] = sc.nextLine();
			}
			
			
			
			map.put(groupName, memberArr);			
		}
		
		// questions
		for (int i = 0; i < numQuestions; i++) {
			// firstLine string
			String line = sc.nextLine();
			// secondLine number
			int questionType = Integer.parseInt(sc.nextLine());
			if (questionType == 1) {
				// line == memberName
				// find key by line
				for(Entry<String, String[]> entry : map.entrySet()) {
					String[] membArr = entry.getValue();
					for (String member : membArr) {
						if (member.equals(line)) {
							System.out.println(entry.getKey());
							break;
						}
					}
				}
			} else {
				// line == groupName
				String[] arr = map.get(line);
				
				// sort memberArr lexi 
				sort(arr, 0, arr.length - 1);
				for (String name : arr) {
					System.out.println(name);
				}
			}
		}
		
	}
	
	private static void merge(String[] arr, int l, int m, int r) {
		// get sizes
		int n1 = m - l + 1;
		int n2 = r - m;
		
		// temp arr
		String[] L = new String[n1];
		String[] R = new String[n2];
		
		// put in data
		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[m + 1 + j];
		}
		
		// init idxes
		int i = 0, j = 0;
		int k = l;
		
		// while 
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j]) < 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		// remainders
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
	private static void sort(String[] arr, int l, int r) {
		if (l < r) {
			// get middle
			int m = l + (r - l) / 2;
			
			// sort 2 halves
			sort(arr, l, m);
			sort(arr, m + 1, r);
			
			// merge 2 halves
			merge(arr, l, m, r);
		}
	}
	
}
