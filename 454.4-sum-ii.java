/*
 * @lc app=leetcode id=454 lang=java
 *
 * [454] 4Sum II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;

        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        for (int i: nums1){
            for (int j:nums2){
                int sums = i+j;
                map.put(sums, map.getOrDefault(sums, 0)+1);
            }
        }

        for (int i: nums3){
            for (int j: nums4) {
                count += map.getOrDefault(0-i-j,0);
            }
        }
        return count;
    }
}
// @lc code=end

