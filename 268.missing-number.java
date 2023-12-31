/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {

        int xor = 0;
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }

        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        
        return xor;
    }
}
// @lc code=end

