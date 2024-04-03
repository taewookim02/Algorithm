class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        String myStr = stones.replaceAll("[" + jewels + "]", "");
        
        return stones.length() - myStr.length();
    }
}