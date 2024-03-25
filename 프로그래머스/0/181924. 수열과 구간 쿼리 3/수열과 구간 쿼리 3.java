class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for (int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
        }
        
        
        return answer;
    }
}