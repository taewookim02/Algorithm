class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] myArr = (n + "").split("");
        int[] myIntArr = new int[myArr.length];
        
        // to int array
        for (int i = 0; i < myIntArr.length; i++) {
            myIntArr[i] = Integer.parseInt(myArr[i]);
        }
           
        // bubbleSort
        for (int i = 0; i < myIntArr.length; i++) {
            for (int j = 0; j < myIntArr.length - 1; j++) {
                if (myIntArr[j] < myIntArr[j + 1]) {
                    int temp = myIntArr[j];
                    myIntArr[j] = myIntArr[j + 1];
                    myIntArr[j + 1] = temp;
                }
            }
        }
        
        String myStr = "";
        for (int i = 0; i < myIntArr.length; i++) {
            myStr += myIntArr[i];
        }
        answer = Long.parseLong(myStr);
        
        return answer;
    }
}