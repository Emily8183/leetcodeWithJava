/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 * 
 * Categories: Array, Sliding Window, Medium

Steps:

1) Initialize Pointers: start (left boundary) and end (right boundary) both set to 0. The window length is "end - start + 1".

2) Use Two Loops:

- Outer loop: Move the end pointer from 0 to the right.

- Inner loop: Move the start pointer to the right.

3) Pointer Movement Conditions:

Move the end pointer, once sum >= target, jump to the inner loop.

Move the start pointer to shorten the window length (until sum< target, the loop will break). Repeat.

4) Update Result:

Each time while sum >= target, update the Result -which is the minimum window length. If no valid subarray is found, return 0.

Tips:

Set the initial value of the Result to the maximum (Integer.MAX_VALUE) so that it can be updated to the smallest value by using Math.min()
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       //设定left和right指针，并把minLength定义为最大初始值
       int left = 0;
       int minLength = Integer.MAX_VALUE;
       int sum = 0;

       //将minLength的值与每一次找到的窗口长度进行比较，取较小值
       for(int right=0; right < nums.length; right++) {
           sum += nums[right];

           while(sum >= target) {
            minLength = Math.min(minLength, right-left+1); //重要：先记录当下的minLength
            sum-=nums[left]; //再不断调整sum与left
            left++;
           }
        }

       //最后判断minLength是否等于Integer.MAX_VALUE，如果等于，说明没有找到满足条件的子数组，返回0，否则返回minLength
       return minLength== Integer.MAX_VALUE? 0:minLength;
    }
}



// @lc code=end

