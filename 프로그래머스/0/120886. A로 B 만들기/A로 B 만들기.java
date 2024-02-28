import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] myArr = before.toCharArray();
        char[] myArr2 = after.toCharArray();
        
        // bubble sort
        char[] myCharArr = bubbleSort(myArr);
        char[] myCharArr2 = bubbleSort(myArr2);
        
        
        answer = Arrays.equals(myCharArr, myCharArr2) ? 1 : 0;
        
        // comparison
        
        return answer;
    }
    
    public char[] bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];                arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        return arr;
    }
}