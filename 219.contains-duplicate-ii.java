/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {

            if (map.containsKey(nums[j])) {
                i = map.get(nums[j]);
                if (Math.abs(i-j) <= k) return true;
            }

            map.put(nums[j], j);

        } 

        return false;
        
    }
}
// @lc code=end

