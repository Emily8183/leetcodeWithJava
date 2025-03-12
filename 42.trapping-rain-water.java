/*
 * @lc app=leetcode id=42 lang=java
 *
 * condition: int[]
 * goal: total size;
 * solution:
 * 1, find the index with the highest bar
 * 2, iterate from the most left bar, if the index < the most left bar, calculate the water amount
 * 3, else: update the most left bar
 * 4, same as the right side
 * 
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
       //for loop, find the highest height
       int peakIndex = 0;
       int water = 0;

       
       for (int i = 0; i < height.length; i++) {
            if (height[i] > height[peakIndex]) {
                peakIndex = i;
            }
       }

       int leftMost = 0;

       for (int i = 0; i < peakIndex; i++) {

           if (height[leftMost] > height[i]) {
                water = water + height[leftMost] - height[i];
           } else {
                leftMost = i;
           }
       }

       int rightMost = height.length -1;

       for (int i = height.length-1; i > peakIndex; i--) {
            if (height[rightMost] > height[i]) {
                water = water + height[rightMost] - height[i];
            } else {
                rightMost = i;
            }

       }

       return water;
    }
}
// @lc code=end

