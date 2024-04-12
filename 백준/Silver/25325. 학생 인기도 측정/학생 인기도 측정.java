import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		String[] students = sc.nextLine().split(" ");

		Map<String, Integer> map = new HashMap<>();
		for (String stu : students) {
			map.put(stu, map.getOrDefault(stu, 0));
		}

		for (int i = 0; i < N; i++) {
			String[] nextLine = sc.nextLine().split(" ");
			for (String stu : nextLine) {
				map.put(stu, map.get(stu) + 1);
			}
		}
		
//		인기도가 높은 순으로 출력
//		같은 경우 학생 이름 기준으로 오름차순으로 출력
		List<Entry<String, Integer>> list= new ArrayList<>(map.entrySet());

		list.sort((entry1, entry2) -> {
			int valueCompare = entry2.getValue().compareTo(entry1.getValue());
			if (valueCompare == 0) {
				return entry1.getKey().compareTo(entry2.getKey());
			}
			return valueCompare;
		});
		
		for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
}
