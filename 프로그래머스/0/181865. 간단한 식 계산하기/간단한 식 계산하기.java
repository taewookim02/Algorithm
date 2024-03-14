class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] myArr = binomial.split(" ");
        int a = Integer.parseInt(myArr[0]);
        String operator = myArr[1];
        int b = Integer.parseInt(myArr[2]);

        switch (operator) {
            case "+": 
                answer = a + b;
                break;
            case "-": 
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
        }
        
        return answer;
    }
}