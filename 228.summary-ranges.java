/*
 * @lc app=leetcode id=228 lang=java
 *
 * [228] Summary Ranges
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        int start = 0;

        for (int end = 0; end < nums.length; end++) {

            if (end + 1 < nums.length && nums[end]+1 == nums[end+1]) {
                continue;
            }

            if (start == end) {
                result.add(String.valueOf(nums[start]));
               
            } else {
                result.add(nums[start] + "->" + nums[end]);
            }

            start = end + 1;
        }

        return result;
        
    }
}
// @lc code=end

