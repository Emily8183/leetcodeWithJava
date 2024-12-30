/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 * 
 * condition: int[] nums, int length = n
 * goal: create an int[] ans, length = 2n; return ans
 */

// @lc code=start
class Solution {

    //solution 1: time and space complexity are both O(n)
    // public int[] getConcatenation(int[] nums) {
    //     int length= 2 * nums.length;

    //     int[] ans = new int[length];

    //     for (int i = 0; i < length; i++) {

    //         if (i < nums.length) ans[i] = nums[i];
    //         else {
    //             ans[i] = nums[i % nums.length];
    //         }
    //     }

    //     return ans;
        
    // }
    
    //solution 2: runtime is faster, but time and space complexity are still both O(n)
    public int[] getConcatenation(int[] nums) {
        int length= 2 * nums.length;

        int[] ans = new int[length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];

            ans[i+nums.length] = nums[i];
        }

        return ans;

    }



}
// @lc code=end

