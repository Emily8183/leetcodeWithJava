/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 * int[] nums <=increasing or all the same or null
 * return k represents the new index of the end of the array
 * solution:
 * 
 * two pointers
 * 
 * 0,0,0,0 => delete the duplicated ones, pointer fast
 * 
 * everytime the pointer fast points at a different number, the slower pointer +1
 * slow pointer represents k
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 1; // slow pointer

        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[fast-1]) {
                nums[k] = nums[fast];
                k++;
            }
        }

        return k;

        
    }
}
// @lc code=end

