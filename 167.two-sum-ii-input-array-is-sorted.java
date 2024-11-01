/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length-1;

        int left = 0;

        int[] arr = new int[2];

        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                arr[0] = left+1;
                arr[1] = right+1;
                break;
            }
        }
        return arr;
    }

}
// @lc code=end

