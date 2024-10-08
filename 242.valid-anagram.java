/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {

        //Solution1: HashMap

        if (s.length() != t.length()) return false;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c,1);
            } else {
                map.put(c,map.get(c)+1);
            }
        }
        
        for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            if (!map.containsKey(c) || map.get(c) < 0) {
                return false;
            } 

            map.put(c,map.get(c)-1);
        }

        for (int num : map.values()) {
            if (num != 0) {
                return false;
            }
        }

        return true;

    }
}
// @lc code=end

