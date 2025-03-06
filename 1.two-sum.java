/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 * int[] nums, int target
 * goal: sum == target, return indices
 * solution: hashmap
 * loop, save the num to a map, calculate the difference, and see if it can be found in the rest of the array
 */

// @lc code=start

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);

            };

            map.put(nums[i],i);

        }

        return result;

    }
}
// @lc code=end

