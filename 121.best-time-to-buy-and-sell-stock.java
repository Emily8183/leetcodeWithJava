/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */
// 做这道题需要注意，lowestNum始终是在prices[i]前面求得的，这是个逻辑先后顺序。因此我们找到的prices[i]一定在lowestNum后面，所得的相减的数字，要么始终保持是0（代表lowestprice后面的数一直递减）
// 要么就是prices[i]-lowestNum之间的最大数

// @lc code=start
class Solution {

   
    public int maxProfit(int[] prices) {

    //int不断更新，直到找到最大的profit
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

