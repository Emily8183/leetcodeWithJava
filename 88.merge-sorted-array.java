/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 * 
 * goal: int[] nums1, int[] nums2 <= sorted
 * int m, int n
 * solution: backward traversal
 * 
 *
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) return;

        int end = nums1.length-1;
        int endOfNums1 = m-1;
        int endOfNums2 = n-1;

        while (endOfNums1 >= 0 && endOfNums2>= 0) {
            
            if (nums1[endOfNums1] > nums2[endOfNums2]) {
                nums1[end] = nums1[endOfNums1];
                endOfNums1--;
            } else {
                nums1[end] = nums2[endOfNums2];
                endOfNums2--;
            }

            end--;
            
        }

        //handle the rest of the nums2
        while (endOfNums2 >= 0) {
            nums1[end] = nums2[endOfNums2];
            endOfNums2--;
            end--;
        }
    }
        
}

// @lc code=end

