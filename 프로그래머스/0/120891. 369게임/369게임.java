class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] orderArr = String.valueOf(order).split("");
        for (int i = 0; i < orderArr.length; i++) {
            System.out.println(orderArr[i]);
            if (Integer.parseInt(orderArr[i]) % 3 == 0 && Integer.parseInt(orderArr[i]) != 0) {
                answer++;
            }
        }
        return answer;
    }
}