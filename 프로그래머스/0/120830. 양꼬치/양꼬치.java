class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        //10 인분이면 음료수 1개 서비스
        // 양꼬치 = n, 12000원
        // 음료수 = k , 2000원
        int serviceDrinkQuantity = n / 10;
        answer = n * 12000 + k * 2000 - serviceDrinkQuantity * 2000; 
        
        return answer;
    }
}