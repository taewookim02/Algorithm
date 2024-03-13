class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                arr[i] >>= 1;
            } else if(arr[i] < 50 && arr[i] % 2 == 1) {
               arr[i] <<= 1;
            } else {
                continue;
            }
        }
        return arr;
    }
}