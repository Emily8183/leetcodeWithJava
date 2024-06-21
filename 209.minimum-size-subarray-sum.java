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
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;

        for ( int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while(sum >= target) {
                result = Math.min(result, right-left+1);
                sum -= nums[left];
                left++;

            }
        }
        return result == Integer.MAX_VALUE? 0 : result;
    }
}



// @lc code=end

