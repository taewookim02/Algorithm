class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        // if arr[i][j] == arr[j][i];
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr.length; j++) {
               if (arr[i][j] == arr[j][i]) {
                   flag = true;
               } else {
                   return 0;
               }
           } 
        }
        
        answer = flag ? 1 : 0;
        return answer;
    }
}