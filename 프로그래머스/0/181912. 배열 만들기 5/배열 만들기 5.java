import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> myArr = new ArrayList<>();
        
        
        for (int i = 0; i < intStrs.length; i++) {
            String myStr = intStrs[i].substring(s, s + l);
            if (Integer.parseInt(myStr) > k) {
                myArr.add(Integer.parseInt(myStr));
            }
        }
        
        answer = myArr.stream().mapToInt(i -> i).toArray();
        

        return answer;
    }
}