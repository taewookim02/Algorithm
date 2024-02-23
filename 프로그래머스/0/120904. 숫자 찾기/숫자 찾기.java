class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        // if num includes k
        // return the included (index+1)
        // else return -1
        String[] myArr = String.valueOf(num).split("");
        
        for(int i = 0; i < myArr.length; i++) {
            if (Integer.parseInt(myArr[i]) == k) {
                answer = i + 1;
                return answer;
            } else if (i == myArr.length - 1) {
                answer = -1;
            }
        }
        
        return answer;
    }
}