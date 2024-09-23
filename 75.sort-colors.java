/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {

        int i = 0;
        int left = 0;
        int right = nums.length-1;

        while (i <= right) { //不需要遍历到蕞后,遍历到right就可以了
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
                // i++; 这里i++不需要,因为从right swap过来的数字也要经过检查
            } else {
                i++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
}
// @lc code=end

