/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 * 
 *  Steps:

 1 Binary search: O(logn)
 2 Get the value from two ends of the array, compare the value, and put the smaller one into the result array first. 
 3 Repeat in the remaining array. 
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

