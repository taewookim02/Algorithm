import java.util.HashMap;
import java.util.Map;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        // use HashMap
        Map<Integer, Integer> myMap = new HashMap();
        for (int val : array) {
            if (myMap.get(val) == null) {
                myMap.put(val, 1);
            } else {
                myMap.put(val, myMap.get(val) + 1);
            }
        }
        int maxKey = 0;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry: myMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            // get max frequency
            if (value > maxValue) {
                maxKey = key;
                maxValue = value;
            }
        }
        
        int maxValueCount = 0;
        for (Map.Entry<Integer, Integer> entry : myMap.entrySet()) {
        	int key = entry.getKey();
        	int value = entry.getValue();
        	if (value == maxValue) {
        		maxValueCount++;
        	}
        }
        if (maxValueCount == 1) {        	
        	answer = maxKey;
        } else {
        	answer = -1;
        }
        System.out.println(answer);
        return answer;
    }
}