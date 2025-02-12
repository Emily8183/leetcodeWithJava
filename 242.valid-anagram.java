/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 * condition: 2 Strings s and t, all lowercase, only letters
 * goal: bool, anagram
 * solution: array (hashmap)
 * 
 * sample: ASCII
 * s = "anagram", t = "nagaram"
 * a = 61 - 'a' = 0
 * n = s[i] - 'a'  = 12
 * int[] freq = new int[26]
 * 
 */

// @lc code=start

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];

        //count the frequency of the letters involved in s, save in an array int[] freq
        for (int i = 0; i < s.length(); i++) {
            freq[ s.charAt(i) - 'a']++;
        }

        //count the frequency of the letters involved in t, int[] freq: minis
        for (int i = 0; i < t.length(); i++) {
            freq[ t.charAt(i) - 'a']--;
        }

        //condition: if freq
        for (int i: freq) {
            if (i != 0) return false;
        }
        
        return true;

       
    }
}
// @lc code=end

