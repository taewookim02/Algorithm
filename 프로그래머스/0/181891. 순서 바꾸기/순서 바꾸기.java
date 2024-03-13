import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        // init arrayList to add
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        
        // get sliced array
        int[] slicedArr = Arrays.copyOfRange(num_list, n, num_list.length);
        
        
        // add sliced array to arrayList
        for (int val : slicedArr) {
            myArrList.add(val);
        }
        
        // add remaining el to arrayList 
        for (int i = 0; i < n; i++) {
            myArrList.add(num_list[i]);
        }
        
        // to array
        answer = myArrList.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}