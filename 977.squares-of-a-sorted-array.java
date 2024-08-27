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
        int left =0;
        int right = nums.length-1;
        int fast = nums.length-1;

        while(left<=right) {
            int leftNum = nums[left]*nums[left];
            int rightNum = nums[right]*nums[right];

            if(leftNum<rightNum){
                result[fast]=rightNum;
                right--;
                fast--;
             
            } else {
                result[fast]=leftNum;
                left++;
                fast--;
                
            }
           
        }

        return result;
    }
}
// @lc code=end

