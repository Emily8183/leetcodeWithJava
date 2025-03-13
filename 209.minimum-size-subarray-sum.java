/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 * 
 * Categories: Array, Sliding Window, Medium
*/

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, sum = 0;

        int min_len = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                min_len = Math.min(min_len, end - start +1);

                sum -= nums[start];
                start++;
            }
        }

        return min_len == Integer.MAX_VALUE? 0 : min_len;

        

    }
}



// @lc code=end

