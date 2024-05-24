/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 * 
 *  Steps:

 1 Two pointers: O(n)
 2 Compare the values from the two ends of the array. Insert the larger value into the end of the new array to maintain the non-decreasing order.
 */



// @lc code=start
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];

        int left = 0, right = nums.length -1;

        int position = nums.length-1;

       while (left <=right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if ( leftSquare < rightSquare) {
                result[position--] = rightSquare;
                right--;
                
            } else {
                result[position--] = leftSquare;
                left++;
            } 
        }
        return result;
        
    }
}
// @lc code=end

