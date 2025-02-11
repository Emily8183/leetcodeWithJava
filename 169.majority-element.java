/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 * condition: int[] nums, nums.length = n
 * goal: return the elements that shows more than n/2
 * 
 * solution: 
 * 1) hashmap  2)Boyer-moore
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        //hashmap
        // int n = nums.length;
       
        // HashMap<Integer, Integer> map = new HashMap<>();
        
        // //to store the freq
        // for (int i = 0; i < n; i++) {
            
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1); //key = nums[i], value = freq

        //     if (map.get(nums[i]) > n/2) {
        //         return nums[i];
        //     }
        // }

        // return -1;

        //boyer-moore

        int count = 0;
        Integer candidate = null;

        for (int num: nums) {
            if (count == 0) candidate = num;

            if (num == candidate) {
                count += 1;  // 遇到相同的数字，增加 count
            } else {
                count -= 1;  // 遇到不同的数字，减少 count
            }

            // count += (num == candidate) ? 1 : -1;

        }

        return candidate;

    }

    
}

// @lc code=end

