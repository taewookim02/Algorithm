import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        
        switch (n) {
            case 1:
                // num_list의 0번 인덱스부터 b번 인덱스
                answer = Arrays.copyOfRange(num_list, 0, slicer[1] + 1); 
                break;
            case 2:
                // num_list의 a번 인덱스부터 마지막 인덱스               
                answer = Arrays.copyOfRange(num_list, slicer[0], num_list.length);
                break;
            case 3:
                // num_list의 a번 인덱스부터 b번 인덱스
                answer = Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1) ;
                break;
            case 4:
                // num_list의 a번 인덱스부터 b번 인덱스까지 c 간격
                ArrayList<Integer> myArr = new ArrayList<>();
                for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    myArr.add(num_list[i]);
                }
                answer = myArr.stream().mapToInt(i->i).toArray();
                break;
        }
        

        return answer;
    }
}