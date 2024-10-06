/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 * 
 * //int[] num1
 * //int[] num2
 * //increasing order
 * //m and n
 * //Solution:
 * 1, iterate nums1[], and find the "real" end of the array, find the index
 * 2, compare the "end" of nums1[] and the end of nums2[]
 * 3, the bigger num goes to the end of nums1
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if ( n == 0) return;

        Integer endOfNums1 = m-1;
        Integer endOfNums2 = nums2.length-1;

        Integer finalEnd = nums1.length-1;

        while (endOfNums1 >= 0 && endOfNums2 >=0) {

             if (nums1[endOfNums1] > nums2[endOfNums2]) {
                nums1[finalEnd] = nums1[endOfNums1];
                endOfNums1--;
      
             } else {
                nums1[finalEnd] = nums2[endOfNums2];
                endOfNums2--;
               
             }
             finalEnd--;

        }     
        
        while (endOfNums2 >= 0) {
           
                nums1[finalEnd] = nums2[endOfNums2];
                endOfNums2--;
                finalEnd--;
                
        }
    }
        
}

// @lc code=end

