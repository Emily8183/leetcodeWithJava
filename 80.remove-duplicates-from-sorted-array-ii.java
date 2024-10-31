/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length <= 2) return nums.length;

        int k = 2;

        for (int i = 2; i < nums.length; i++) {
           if (nums[i] != nums[k-2]) { //这里不能和i-2相比，因为i-2这个值已经通过k更改
                nums[k] = nums[i];
                k++;
            }
        }

        return k;

    }
}
// @lc code=end

