import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        // key : value
        // len : 0
        for (String str : strArr) {
            int len = str.length();
            myMap.putIfAbsent(len, 0);
            myMap.put(len, myMap.get(len) + 1);
        }
        
        int[] myArr = new int[myMap.size()];
        
        int idx = 0;
        for (int val : myMap.values()) {
            myArr[idx++] = val;
        }
        
        for (int i = 0; i < myArr.length - 1; i++) {
            for (int j = 0; j < myArr.length - 1 - i; j++) {
                // sort desc
                if (myArr[j] < myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] =temp; 
                }
            }
        }
        
        
        answer = myArr[0];

        
        return answer;
    }
}