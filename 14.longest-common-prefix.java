/*
 * @lc app=leetcode id=14 lang=java
 
 * [14] Longest Common Prefix
 * goal: find the longest common prefix string 
 * 1) edge case: array is empty
 * 2) 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];

        for (int i = 1; i <= strs.length-1; i++) {

            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;

     
        
    }
}
// @lc code=end

