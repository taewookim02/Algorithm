import java.util.Arrays;
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int myFirstLength = num_list.length/n;
        
        int[][] myArr = new int[myFirstLength][n];
        // 1   2   3   4
        // 1 2 1 2 1 2 1 2
        int count = 0;
        for (int i = 0; i < myArr.length; i++) {
            for (int j = 0; j < n; j++) {
                myArr[i][j] = num_list[count];
                count++;
            }
        }
        
        return myArr;
    }
}