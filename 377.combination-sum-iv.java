/*
 * @lc app=leetcode id=377 lang=java
 *
 * [377] Combination Sum IV
 */
// 需要用动态规划，以后再做

// @lc code=start
class Solution {
    
    int count = 0;

    public int combinationSum4(int[] nums, int target) {
        backtracking(nums, target, 0);
        return count;
    }

    private void backtracking(int[] nums, int target, int sum) {

        if(sum > target) return;
        
        if (sum == target) count++;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            backtracking(nums, target, sum);
            sum -= nums[i];
        }
    }
}


// @lc code=end

