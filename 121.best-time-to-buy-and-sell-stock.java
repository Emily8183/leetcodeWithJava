/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {

   
    public int maxProfit(int[] prices) {

    int maxProfit = 0;

    //找到最低的购入点
    int lowestNum = Integer.MAX_VALUE;

    for(int i=0; i<prices.length; i++) {
        lowestNum = Math.min(lowestNum, prices[i]);
        maxProfit = Math.max(maxProfit, prices[i]-lowestNum);

    }

    return maxProfit;

    
}

}
// @lc code=end

