class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 모든 원소들의 곱
        int myNum = 1;
        // 모든 원소들의 합의 제곱
        int myNum2 = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            myNum *= num_list[i];
            myNum2 += num_list[i];
        }
        myNum2 = myNum2 * myNum2;
        
        System.out.println(myNum);
        System.out.println(myNum2);
        
        
        
        answer = myNum < myNum2 ? 1 : 0;
        
        return answer;
    }
}