/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int numCounter = 0;
        int finalCount = 0;
        int i = 0;
        for (int n : nums) {
            if (i == 0 || ((n == nums[i - 1]) && (numCounter < 2))) {
                nums[i++] = n;
                numCounter++;
                finalCount++;
            }

            else if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
                numCounter = 1;
                finalCount++;
            }
        }

        return finalCount;

    }
}
// @lc code=end

