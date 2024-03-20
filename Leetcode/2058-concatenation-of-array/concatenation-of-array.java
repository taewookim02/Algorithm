class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = nums.length, j = 0; i < ans.length; i++, j++) {
            ans[i] = nums[j];
            if (j == nums.length - 1) {
                j = 0;
            }
        }
        return ans;
    }
}