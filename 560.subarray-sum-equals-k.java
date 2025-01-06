/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); //需要初始化第一个前缀和（0，1)
    
        int sum = 0;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];  //sum = sum + nums[i];

            if (map.containsKey(sum - k)) {
                // map.get(sum-k)--;  Java 中的 HashMap 不支持直接修改值（value）的操作
                count += map.get(sum-k);
                // count++; 这是错误的
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
// @lc code=end

