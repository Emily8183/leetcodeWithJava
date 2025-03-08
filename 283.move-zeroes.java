/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        int slow = 0; 

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
           
        }

        for (int i = slow; i < nums.length; i++) {
            nums[i] = 0;
        }
       
    }
}

// @lc code=end

