import java.util.ArrayList;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList<Integer>();
        for (int i = 0; i < num_list.length; i += n) {
            myArr.add(num_list[i]);
        }
        answer = myArr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}