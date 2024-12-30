/*
 * @lc app=leetcode id=42 lang=java
 *
 * condition: int[]
 * goal: total size;
 * solution:
 * 1, find the index with the highest bar
 * 2, iterate from the most left bar, if the index < the most left bar, calculate the water amount
 * 3, else: update the most left bar
 * 4, same at the right side
 * 
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int peakIndex = 0;
        int water = 0;

        for (int i = 0; i < height.length; i++) {
           if (height[i] > height[peakIndex]) {
            peakIndex = i;
           }
        }

        //traverse from leftMost index to the peak index, [)
        int leftMost = 0;

        for (int i = 0; i < peakIndex; i++) {
            if (height[leftMost] > height[i]) {
                water = water + height[leftMost] - height[i];
            } else {
                leftMost = i;
            }
        }

        //traverse from RightMost index to the peak index, (]
        int rightMost = height.length - 1;

        for (int i = height.length - 1; i > peakIndex; i--) {
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

