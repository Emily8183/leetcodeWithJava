/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        //左闭右闭
        int left =0;
        int right = nums.length -1;

        while(left <= right)
        //想象一下如果left = right， [1,1]这是个合法的区间，因此要用<=

        {
           int mid = left + (right-left)/2; //mid指中间值的下标，这个公式可以防止溢出

           if(nums[mid] == target) {
            return mid;
           } else if(nums[mid] < target){
            left = mid + 1;
           } else {right = mid-1;}

        }

        return -1;
        
    }
}
// @lc code=end

