class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        // sort array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        
        // get middle value
        // 5일경우 array.length / 2
        answer = array[array.length / 2];
       
        return answer;
    }
}