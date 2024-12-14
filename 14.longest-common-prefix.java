/*
 * @lc app=leetcode id=14 lang=java
 *goal: to find the longest prefix
 solution: assuming the longest is the first word, chop off the letters dont match
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

           while (!strs[i].startsWith(prefix)) { 
                    prefix = prefix.substring(0, prefix.length()-1);
                }
        }
        

        return prefix;
        
    }
}
// @lc code=end

