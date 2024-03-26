import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> myIndexArr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                myIndexArr.add(i);
            }
        }     

        switch(myIndexArr.size()) {
            case 0:
                System.out.println("0000");
                answer = new int[1];
                answer[0] = -1;
                break;
            case 1:
                System.out.println("1111");
                answer = new int[1];
                answer[0] = 2;
                break;
            default: {
                int indexArrLen = myIndexArr.size();
                answer = Arrays.copyOfRange(arr, myIndexArr.get(0), myIndexArr.get(indexArrLen - 1) + 1);
                break;
            }
        }
                
        return answer;
    }
}