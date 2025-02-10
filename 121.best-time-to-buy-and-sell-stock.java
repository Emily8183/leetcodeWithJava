/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 * 
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

condition； int[] prices
prices[0] = 2, stock on the first day is 2

prices = [7,1,5,3,6,4]

max_profit = Math.max(prices[y] - prices[x]）

solution: dp, look for the smallest number

TC: O(n); SC: O(1)


 */


// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {

       int lowestNum = Integer.MAX_VALUE;
       int maxProfit = 0;
       
       for (int i = 0; i < prices.length; i++) {
            lowestNum = Math.min(prices[i], lowestNum);
            maxProfit = Math.max(prices[i] - lowestNum, maxProfit); 
    
    }

    return maxProfit;
    }

}
// @lc code=end

