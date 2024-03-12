class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxHeight = 0;
        int maxWidth = 0;
        // loop through each sizes
        for (int[] arr : sizes) {
            int width = arr[0] > arr[1] ? arr[0] : arr[1];
            int height = arr[0] > arr[1] ? arr[1] : arr[0];
            
            if (width > maxWidth) {
                maxWidth = width;
            }
            if (height > maxHeight) {
                maxHeight = height;
            }
            
        }
        
        answer = maxWidth * maxHeight;        
        
        return answer;
        
        // 80, 70
        // 15, 8
        // 19, 7
        
    }
}