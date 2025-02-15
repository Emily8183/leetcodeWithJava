/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 * condition: int[] nums,
 * goal: bool, check if any value appears >= 2
 * solution: hashset
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            if (!set.add(num)) {  //OR: if (set.contains(num))
                return true;
            } else {
                set.add(num);
            }
    
        }

        return false;
      
    }
}
// @lc code=end

