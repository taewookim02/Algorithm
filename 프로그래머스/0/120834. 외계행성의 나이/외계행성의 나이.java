class Solution {
    public String solution(int age) {
        String answer = "";
        
        /*
        a 0
        b 1
        c 2
        d 3
        e 4
        f 5
        g 6
        h 7
        i 8
        j 9
        */
        
        String[] myArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String[] myIntArr = (String.valueOf(age)).split("");
        // for each string char replace to char
        for (int i = 0; i < myIntArr.length; i++) {
 
            // String ageStr = String.valueOf(int)
            switch(myIntArr[i]) {
                    case "0" -> answer += myArr[0];
                    case "1" -> answer += myArr[1];
                    case "2" -> answer += myArr[2];
                    case "3" -> answer += myArr[3];
                    case "4" -> answer += myArr[4];
                    case "5" -> answer += myArr[5];
                    case "6" -> answer += myArr[6];
                    case "7" -> answer += myArr[7];
                    case "8" -> answer += myArr[8];
                    case "9" -> answer += myArr[9];
            }
        }
        
        return answer;
    }
}