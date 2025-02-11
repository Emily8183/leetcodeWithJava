/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 * condition: int[] nums, nums.length = n
 * goal: return the elements that shows more than n/2
 * 
 * solution: 
 * hashmap
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
       
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //to store the freq
        for (int i = 0; i < n; i++) {
            
            map.put(nums[i], map.getOrDefault(nums[i],0)+1); //key = nums[i], value = freq

            if (map.get(nums[i]) > n/2) {
                return nums[i];
            }
        }

        return -1;

    }

    
}

// @lc code=end

