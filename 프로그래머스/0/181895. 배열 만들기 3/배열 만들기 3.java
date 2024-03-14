import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList<>();
        
        for (int[] interval : intervals) {
            int startIndex = interval[0];
            int endIndex = interval[1];
            for (int i = startIndex; i <= endIndex; i++) {
                myArr.add(arr[i]);
            }
        }
        
        answer = myArr.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}