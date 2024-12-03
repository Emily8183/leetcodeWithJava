/*
 * @lc app=leetcode id=2486 lang=java
 *
 * [2486] Append Characters to String to Make Subsequence
 */

// @lc code=start
class Solution {
    public int appendCharacters(String s, String t) {
        int count = 0;

        int slow = 0;

        for (int fast = 0; fast < s.length(); fast++) {
            if (slow < t.length() && t.charAt(slow) == s.charAt(fast)) {
                slow++;
                count++;
            }

            if (count == t.length()) return 0;
        }

        return t.length() - count;
        
    }
}
// @lc code=end

