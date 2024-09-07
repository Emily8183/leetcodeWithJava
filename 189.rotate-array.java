/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
   public void rotate(int[] nums, int k) {
    // if ( k > nums.length) { //if可以省略
        k = k % nums.length; //如果k<length, mod的结果就直接是k；如果k>length，mod的结果是余数
    // }
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    private void reverse (int[] nums, int start, int end) {

        if (nums.length == 1 ) return;

        if (start >= end) return;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
// @lc code=end

