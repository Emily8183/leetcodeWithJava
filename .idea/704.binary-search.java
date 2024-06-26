/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 * Steps:
 * 1) Use Binary Search to pursue the runtime complexity O(logn) (Can only use this algorithm when the array is sorted)
 * 2) Iterate the array with a while loop:
   *Find a mid point, compare the target with the mid point;
   *If-else: search in the left and right, if the target is smaller than the mid point, search in the left;
   Else if search in the right;
   Else return -1 if the target is not found.1
   
   Tips:
   1) Notice the settings for the range of the while loop, while (left <= right), it means [left, right]; 
   You can also set as while (left<right) as the condition, but you will need to change the left and right to [left, right);
   2) While we use Math.floor() in JavaScript, when we divide two integers in Java, the output is always an integer.
   3) However, the sum of left and right could cause overflow. So we are using the formula left + (right - left) / 2 to prevent overflow.
 */

// @lc code=start
//左闭右闭的版本
class Solution {
    public int search(int[] nums, int target) {
      
        int left = 0, right = nums.length - 1;
      
        while (left <= right ) {
            //注意这里是<=，说明是个左闭右闭的区间
            // int mid = (left+right)/2   不建议这个做法，prevent overflow
            int mid = left + (right - left) / 2;
            
           if (target > nums[mid] ) {
                left = mid + 1;
                 //注意这里mid +1，保持左闭右闭的区间
            }
            else if (target < nums[mid]) {
                right = mid - 1;
                //注意这里mid -1，保持左闭右闭的区间
            } else {
                return mid;
            }
            
        }
        return -1;
       
    }
}
// @lc code=end

