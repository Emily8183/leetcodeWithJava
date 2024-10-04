/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {

        //inclusive left, exclusive right 左闭右开
        int left = 0;
        int right = nums.length;

        while (left < right) {
            // int middle = (left + right)/2;
            int middle = left + (right-left)/2; //to avoid overflow

            if ( target < nums[middle]) {
                right = middle;
            } else if (target > nums[middle]) {
                left = middle +1;
            } else if (target == nums[middle]) {
                return middle;
            } 
        }

        return left; //if target is not found, left will be the insert position
        
    }
}
// @lc code=end

