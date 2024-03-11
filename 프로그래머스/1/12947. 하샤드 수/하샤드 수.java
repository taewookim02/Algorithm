class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String myStr = "" + x;
        for (int i = 0; i < myStr.length(); i++) {
            sum += Character.getNumericValue(myStr.charAt(i));
        }
        answer = x % sum == 0 ? true : false;
        System.out.println(answer);
        
        return answer;
    }
}