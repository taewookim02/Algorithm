class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] myArr = my_string.split("");
        for (int i = 0; i < myArr.length; i++) {
            if (Character.isUpperCase(myArr[i].charAt(0))) {
                answer += Character.toString(Character.toLowerCase(myArr[i].charAt(0)));
            } else {
                answer += Character.toString(Character.toUpperCase(myArr[i].charAt(0)));
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}