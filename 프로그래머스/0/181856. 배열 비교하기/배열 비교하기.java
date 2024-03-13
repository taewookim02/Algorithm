class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr2.length > arr1.length) {
            return -1;
        }
        
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
            sum2 += arr2[i];
        }
        
        answer = sum1 > sum2 ? 1 : sum1 == sum2 ? 0 : -1;
            
        
        
        return answer;
    }
}