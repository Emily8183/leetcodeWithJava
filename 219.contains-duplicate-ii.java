/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 * condition: int[] nums, int k
 * goal: find two nums are the same, and abs(i-j) <= k
 * solution: sliding window?
 * 
 * sample: nums = [1,2,3,1], k = 3
 * nums[i] = 1, j = i+3 = 4, nums[j] = 
 * 
 * HashMap
 * 
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            if (map.containsKey(nums[j])) {
                i = map.get(nums[j]);

                if (Math.abs(i-j) <= k) return true;
            }

            map.put(nums[j],j);
        }

        
        return false;
       
        
    }
}

// @lc code=end

