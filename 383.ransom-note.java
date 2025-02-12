/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 * condition: String ransomNote, String magazine, only small letters
 * goal: ransomNote = "aab", magazine = "ba", boolean
 * solution: ASCII, array; HashMap
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26]; // [0,1,2,3,4,...]

        //loop in ransomNote, record the freq of each letter
        for (int i = 0; i < ransomNote.length(); i++) {
            freq[ransomNote.charAt(i) - 'a']++;
        }

        //loop in ransomNote, minus the freq of each letter
        for (int i = 0; i < magazine.length(); i++) {
            freq[magazine.charAt(i) - 'a']--;
        }

        //if all the numbers become <= 0, return true
        for (int n : freq) {
            if (n > 0) return false;
        }

        return true;
    }
}
// @lc code=end

