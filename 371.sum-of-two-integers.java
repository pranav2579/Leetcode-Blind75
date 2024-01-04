/*
 * @lc app=leetcode id=371 lang=java
 *
 * [371] Sum of Two Integers
 */

// @lc code=start
class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int answer = a ^ b;
            int carry = (a & b) << 1;
            a = answer;
            b = carry;
        }
        
        return a;
    }
}
// @lc code=end

