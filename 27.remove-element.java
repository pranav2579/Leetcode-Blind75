/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {

        int first = 0;
        int last = nums.length-1;
        int count = 0;
        while (first <= last) {
            if (nums[first] == val) {
                int temp = nums[last];
                nums[last] = nums[first];
                nums[first] = temp;
                last--;
            } else {
                count++;
                first++;
            }
        }

        return count;
    }
}
// @lc code=end

