/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        
    int slow = 0;

    for (int fast = 0; fast < t.length(); fast++) {
    
        if (slow < s.length() && t.charAt(fast) == s.charAt(slow)) { // round1: str2[0] = b, round2: str2[1] = a
            slow++;
        } 
    }

    return slow == s.length(); 
    }
}
// @lc code=end

