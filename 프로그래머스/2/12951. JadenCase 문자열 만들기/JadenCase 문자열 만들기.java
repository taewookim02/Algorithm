class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        
        String[] splitArr = s.split(" ", -1);
        String[] resultArr = new String[splitArr.length];
        for (int i = 0; i < splitArr.length; i++) {
            if (!splitArr[i].isEmpty()) {
                // if cur val isn't blank space
                resultArr[i] = splitArr[i].substring(0, 1).toUpperCase() + splitArr[i].substring(1);
            } else {
                resultArr[i] = splitArr[i].toUpperCase();
            }
        }
        
        answer = String.join(" ", resultArr);
        
        return answer;
    }
}