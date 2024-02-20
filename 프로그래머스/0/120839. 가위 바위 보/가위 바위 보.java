class Solution {
    public String solution(String rsp) {
        String answer = "";
        /*
        2 -> 0
        0 -> 5
        5 -> 2
        */
        String[] myArr = rsp.split("");
        for (int i = 0; i < myArr.length; i++) {
            switch (Integer.parseInt(myArr[i])) {
                    case 2 -> answer += 0;
                    case 0 -> answer += 5;
                    case 5 -> answer += 2;
            }
        }
        return answer;
    }
}