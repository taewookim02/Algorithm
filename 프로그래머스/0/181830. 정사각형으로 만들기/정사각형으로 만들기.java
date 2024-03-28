import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int firstLvlLen = arr.length;
        int secondLvlLen = arr[0].length;

        if (firstLvlLen == secondLvlLen) {
            return arr;
        } 
        
        
        if (secondLvlLen > firstLvlLen) {
            int[][] myArr = new int[secondLvlLen][secondLvlLen];
            for (int i = 0; i < myArr.length; i++) {
                if (i < firstLvlLen) {
                    myArr[i] = Arrays.copyOfRange(arr[i], 0, secondLvlLen);
                } 
            }
            return myArr;
        }
        


        // first level > second level
        if (firstLvlLen > secondLvlLen) {
            int[][] myArr = new int[firstLvlLen][firstLvlLen];
            for (int i = 0; i < myArr.length; i++) {
                for (int j = 0; j < myArr[i].length; j++) {
                    // 4, 2 
                    // 0, 1
                    // 0, 2
                    
                    if (j < secondLvlLen) {
                        myArr[i][j] = arr[i][j];    
                    }
                }
            }
            return myArr;
        }
        
        
               
        return answer;
    }
}