/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //解法1：双指针
        // Arrays.sort(nums);

        // for(int i=1;i<nums.length;i++) {
        //     if(nums[i]==nums[i-1]){
        //         return true;
        //     }
        // }

        // return false;

        //解法2：hashmap

        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num,0)+1);

            if(map.get(num) > 1) return true;
        }

        return false;
        
    }
}
// @lc code=end

