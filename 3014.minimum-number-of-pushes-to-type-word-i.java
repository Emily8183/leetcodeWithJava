/*
 * @lc app=leetcode id=3014 lang=java
 *
 * [3014] Minimum Number of Pushes to Type Word I
 */

// @lc code=start
class Solution {
    public int minimumPushes(String word) {
       HashMap<Character, Integer> map = new HashMap<>();

       int res = 0;

       for (char c : word.toCharArray()) {
        map.put(c, map.size()/8+1);
        res += map.get(c);
       }

       return res;
    }
}
// @lc code=end

