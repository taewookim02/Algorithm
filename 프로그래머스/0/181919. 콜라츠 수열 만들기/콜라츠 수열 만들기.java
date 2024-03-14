import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList<>();
        while (n != 1) {
            myArr.add(n);
            n = n % 2 == 0 ? n / 2 : 3 * n + 1;
        }
        myArr.add(1);
        
        answer = myArr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}