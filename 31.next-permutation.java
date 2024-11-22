/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 * 
 * solution:
 * 1) looking for the permutation right next to the given one;
 * 2) traverse from the end of the array, find the first index of descending, which is i;
 * 3) find the index j which is the smallest greater than i;
 * 4) swap i and j, reverse the rest of the array
 * 5) otherwise, reverse the entire array
 * 
 * e.g. 486653, 第一个降序出现在4，那么swap 4 and 5，=》 586643 =》 534668
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i+1] <= nums[i]) {
            i--;
        }

        int j = nums.length -1;

        if (i >= 0) {

            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);

            reverse(nums, i+1, nums.length-1);
            
        } else {
            reverse(nums, 0, nums.length-1);
        }
 
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }

}
// @lc code=end

