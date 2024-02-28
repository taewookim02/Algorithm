import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] myArr = letter.split(" ");
		HashMap<String, String> myHashMap = new HashMap<String, String>();
		myHashMap.put(".-", "a");
		myHashMap.put("-...", "b");
		myHashMap.put("-.-.", "c");
		myHashMap.put("-..", "d");
		myHashMap.put(".", "e");
		myHashMap.put("..-.", "f");
		myHashMap.put("--.", "g");
		myHashMap.put("....", "h");
		myHashMap.put("..", "i");
		myHashMap.put(".---", "j");
		myHashMap.put("-.-", "k");
		myHashMap.put(".-..", "l");
		myHashMap.put("--", "m");
		myHashMap.put("-.", "n");
		myHashMap.put("---", "o");
		myHashMap.put(".--.", "p");
		myHashMap.put("--.-", "q");
		myHashMap.put(".-.", "r");
		myHashMap.put("...", "s");
		myHashMap.put("-", "t");
		myHashMap.put("..-", "u");
		myHashMap.put("...-", "v");
		myHashMap.put(".--", "w");
		myHashMap.put("-..-", "x");
		myHashMap.put("-.--", "y");
		myHashMap.put("--..", "z");

        for (String str : myArr) {
            answer += myHashMap.get(str);
        }
        
        return answer;
    }
}