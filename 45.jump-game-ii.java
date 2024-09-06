/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int n=nums.length;

        int j = 0;//farthest

        int coverage =0;

        int jump = 0;

        if(n==1) return 0;

        for (int i=0; i<=n-1; i++) {
            j = Math.max(j, nums[i]+i);

            if(i== coverage) { // 当到达当前跳跃的终点时，进行下一次跳跃
                jump++;
                coverage = j;
            }

            if(coverage >=n-1) break;
            
        
        }

        return jump;
    }
}
// @lc code=end

