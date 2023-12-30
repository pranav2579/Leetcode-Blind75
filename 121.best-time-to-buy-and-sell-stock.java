/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfitSoFar = Integer.MIN_VALUE;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minSoFar) {
                minSoFar = prices[i];
            }

            profit = prices[i] - minSoFar;
            if (profit > maxProfitSoFar) {
                maxProfitSoFar = profit;
            }
        }

        return maxProfitSoFar;
    }

}
// @lc code=end
