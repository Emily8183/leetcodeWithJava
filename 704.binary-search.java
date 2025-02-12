/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 * condition: int[] nums, ascending order (binary search), int target
 * goal: find the index of the target; or return -1, TC O(log n)
 * 
 * solution: (binary search)
 * 
 * nums = [-1,0,3,5,9,12], target = 9
 * mid = left + (right-left)/2 = 3
 * nums[mid] = 5
 * 
 * 
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        //edge cases
        if (nums.length == 0) return -1;

        if (target < nums[0] || target > nums[nums.length-1]) return -1;
        
        int left = 0; //left inclusive
        int right = nums.length; //right exclusive

        while (left < right) {
            int mid = left + (right-left)/2;

            if (nums[mid] < target) {
                left = mid+1;
            } else if (nums[mid] > target) {
                right = mid;
            } else if (nums[mid] == target) return mid;

        }

        return -1;
    }
      

}
// @lc code=end

