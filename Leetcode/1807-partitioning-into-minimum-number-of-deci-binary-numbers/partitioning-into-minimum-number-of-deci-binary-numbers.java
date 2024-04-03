class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for (int i = 0; i < n.length(); i++) {
            int curNum = Character.getNumericValue(n.charAt(i));
            if (max < curNum) {
                max = curNum;
            }
        }
        return max;
    }
}