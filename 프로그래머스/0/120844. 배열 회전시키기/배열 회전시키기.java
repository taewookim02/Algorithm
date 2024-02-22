class Solution {
    public int[] solution(int[] numbers, String direction) {
        int maxIndex = numbers.length - 1; 
        
        if (direction.equals("right")) {
            int lastValue = numbers[maxIndex]; 
            for (int i = maxIndex; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = lastValue; // set 1st el
        } else if (direction.equals("left")) {
            int firstIndexValue = numbers[0];
            for (int i = 0; i < maxIndex; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[maxIndex] = firstIndexValue;
        }
        return numbers;
    }
}