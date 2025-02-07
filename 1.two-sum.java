/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 * condition: int[] nums, int target
 * goal: return two indices: num1 + num2 == target (only 1 solution, each element can only be used for once)
 * int[] nums = [2,7,11,15] target = 9
 * int num1 = 2, different = 9-2 = 7, int num2 = 7
 * 
 * output: [2, 7]
 * 
 * relution: hashmap
 * 
 */

// @lc code=start

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i <= nums.length-1; i++) {

            //find a number: target - nums[i]
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                result[0] = i;
                result[1] = map.get(difference);
            }
        
            // for loop, save key-value: key is the nums[i], value is i
            map.put(nums[i],i);

        }

        return result;  
        
    }
}
// @lc code=end

