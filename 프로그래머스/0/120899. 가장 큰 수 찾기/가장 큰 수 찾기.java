class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        // get max
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                maxIndex = i;
            }
        }
        int[] answer = {max, maxIndex};

        // get index by max value
        return answer;
    }
}