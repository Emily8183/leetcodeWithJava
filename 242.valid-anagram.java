/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {

        int[] count = new int[26];

        for (int i=0; i< s.length();i++) {
            count[s.charAt(i) -'a'] ++;
        }

        for (int i=0; i< t.length();i++) {
            count[t.charAt(i) -'a']--;
        }

        for (int i=0; i < count.length; i++) {
            if (count[i] != 0) {
            return false;
            }
        }
        //还有另一种写法，for(int count:record)

        return true;
        
    }
}
// @lc code=end

