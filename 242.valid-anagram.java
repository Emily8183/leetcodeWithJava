/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 * goal: s and t, lowercase, isAnagram
 * solution: int[], convert letters to Ascii, ++ in s, -- in t
 */

// @lc code=start

class Solution {
    public boolean isAnagram(String s, String t) {

       int[] count = new int[26];

       for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';
            count[num]++;
       }

       for (int i = 0; i < t.length(); i++) {
            int num = t.charAt(i) - 'a';
            count[num]--;
       }

       for (int i : count) {
            if (i != 0) return false;
       }

       return true;

       
    }
}
// @lc code=end

