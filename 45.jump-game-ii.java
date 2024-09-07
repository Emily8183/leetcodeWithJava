/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {

        int n = nums.length;

        int farthestPoint = 0; //未来时

        int currentCoverage = 0; //现在时

        int jump = 0;

        if (n == 1) return 0;

        //解法1：
        // for (int i = 0; i < n; i++) {

        //     farthestPoint = Math.max(farthestPoint, nums[i]+i);

        //     if (i == currentCoverage) {

        //         if (currentCoverage != n-1) { //if currentCoverage没有走到终点
        //             jump++;
        //             currentCoverage = farthestPoint;

        //             if (currentCoverage >= n-1) break;
        //         } 
                
        //         else break; //else已经走到终点
        //     }

        // }
        
        //解法2：
        for (int i = 0; i <= farthestPoint && i < n-1; i++) { 
            //这里是n-1,蕞后一个数没有意义遍历，因为倒数第二个数至少可以走一个单位

            farthestPoint = Math.max(farthestPoint, nums[i]+i);

            if (i == currentCoverage) { //什么时候不得不跳？当超出现在的覆盖范围，就得做出新的延申
                currentCoverage = farthestPoint; 
                jump++;
            }
        
        }

        return jump;
    }
}
// @lc code=end

