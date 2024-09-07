/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {

        if (nums.length == 1) return true;

        int coverage =0;

        for(int i=0; i <= coverage; i++) { 
            coverage = Math.max(coverage, nums[i]+i);

            if(coverage>=nums.length-1) return true;

        }

        return false;

    }
}
// @lc code=end

