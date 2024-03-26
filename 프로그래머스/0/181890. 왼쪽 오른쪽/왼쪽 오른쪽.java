class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String joinStr = String.join("", str_list);

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("r")) {
                answer = joinStr.substring(i+1).split("");
                break;
            } else if (str_list[i].equals("l")) {
                answer = joinStr.substring(0, i).split("");
                break;
            }
        }
        
        
        for (String str : answer) {
            if (str.equals("")) return new String[0];
        }
        return answer;
    }
}