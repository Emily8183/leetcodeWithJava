/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {

        //corner case
        if (nums.length == 0) return 0;

        //save the numbers to hashset, and make sure no duplicates
        HashSet<Integer> set = new HashSet<>();

        int maxCount = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        //check if n-1 is also in the hashset, if so, that could be the head of the sequence; for example, in the array of [100,4,200,1,3,2], 100, 200, and 1 could be the head;
        for (int num : set) {
            
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                count++;
                currentNum++;
                }

                maxCount = Math.max(count, maxCount);
            }
            
        }

        return maxCount;

        //check if there is n + (1+i)  in the array
    }
}
// @lc code=end

