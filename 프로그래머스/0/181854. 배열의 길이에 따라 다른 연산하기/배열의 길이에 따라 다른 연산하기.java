class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        boolean isEvenArr = arr.length % 2 == 0 ? true : false;
        for (int i = 0; i < answer.length; i++) {
            if (isEvenArr) {
                // 홀수 인덱스 + n
                answer[i] = i % 2 == 1 ? arr[i] += n : arr[i];
            } else {
                // 짝수 인덱스 + n
                answer[i] = i % 2 == 0 ? arr[i] += n : arr[i];

            }
        }
        return answer;
    }
}