class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String line = quiz[i];
            String[] lineArr = line.split(" ");
            
            int first = Integer.parseInt(lineArr[0]);
            String operation = lineArr[1];
            int second = Integer.parseInt(lineArr[2]);
            int last = Integer.parseInt(lineArr[4]);

            if (operation.equals("+")) {
                // plus
                int result = first + second;
                if (result == last) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            } else if (operation.equals("-")) {
                // minus
                int result = first - second;
                if (result == last) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        
        return answer;
    }
}