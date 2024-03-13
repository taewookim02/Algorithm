import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList();
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                myArr.add(i);
            }
        }
        
        // ArrayList to arr
        answer = myArr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}