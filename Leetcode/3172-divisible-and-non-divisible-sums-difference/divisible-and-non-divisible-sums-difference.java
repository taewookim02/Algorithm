class Solution {
    public int differenceOfSums(int n, int m) {
        int[] arr = new int[n];
        int num1 = 0, num2 = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
            if (arr[i] % m == 0) {
                // divisible
                num2 += arr[i];
            } else {
                num1 += arr[i];
            }
        }
        return num1 - num2;
    }
}