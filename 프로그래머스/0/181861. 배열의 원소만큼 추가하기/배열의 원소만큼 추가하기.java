import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                myArr.add(arr[i]);
            }
        }
        answer = myArr.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}