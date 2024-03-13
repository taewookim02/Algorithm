import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        // sort
        for (int i = 0; i < num_list.length - 1; i++) {
            for (int j = 0; j < num_list.length - 1 - i; j++) {
                if (num_list[j] > num_list[j + 1]) {
                    int temp = num_list[j];
                    num_list[j] = num_list[j + 1];
                    num_list[j + 1] = temp;
                }
            }
        }
        
        answer = Arrays.copyOfRange(num_list, 5, num_list.length);
        

        return answer;
    }
}