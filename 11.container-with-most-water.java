/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {

        //bruce force
        // int area = 0;
        // int maxArea = 0;

        // for (int left = 0; left < height.length; left++) {
        //     for (int right = 1; right < height.length; right++) {

        //         int minHeight = Math.min(height[left], height[right]);

        //         area = (right - left) * minHeight;

        //         maxArea = Math.max(area, maxArea);
        //     }
        // }

        // return maxArea;

        //two pointers: left and right, 取数字小的一头往内移动，直至left == right

        int area = 0;
        int maxArea = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            area = (right - left) * minHeight;
            maxArea = Math.max(area, maxArea);

            if (height[left] <= height[right]) left++;
            else right--;
        }

        return maxArea; 
    }
}
// @lc code=end

