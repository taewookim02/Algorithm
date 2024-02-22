import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        List<Integer> numbers = new ArrayList<>();
        
        String[] myArr = my_string.split("");
        
        // get only numbers
        for (int i = 0; i < myArr.length; i++) {
            if(myArr[i].matches("-?\\d+")) {
                numbers.add(Integer.parseInt(myArr[i]));
            }
        }
        
        // change to array
        int [] answer = numbers.stream().mapToInt(i -> i).toArray();
        

        // ascending sort 
        for (int i = 0; i < answer.length - 1; i++) {
            for (int j = 0; j < answer.length - 1 - i; j++) {
                if (answer[j] > answer[j + 1]) {
                    int temp = answer[j];
                    answer[j] = answer[j + 1];
                    answer[j + 1] = temp;
                }
            }
        }
        
        
        
        return answer;
    }
}