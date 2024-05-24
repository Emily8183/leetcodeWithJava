/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 * 
 * Steps：
 * 1）The 
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for ( int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum >= target) {
                result = Math.min(result, right-left+1);
                sum -= nums[left];
                left++;

            }
        }
        return result == Integer.MAX_VALUE? 0 : result;
    }
}



// @lc code=end

