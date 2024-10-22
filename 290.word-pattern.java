/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 * 
 * solution:
 * 1, hashmap: key-value pair, key is the letter, value is the word
 * 
 * 2, save unrepeated letters to hashmap; else (found the same letter), check the value; return false if different value
 * 
 * 3, if found same value, return false;
 * 
 * 
 */

// @lc code=start

import java.util.Map;
import java.util.Set;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        String[] sWords = s.split(" ");

        if (pattern.length() != sWords.length) return false;

        for (int i = 0; i < pattern.length(); i++) {

            char letter = pattern.charAt(i);

            if (map.containsKey(letter)) {
                if(map.get(letter) != sWords[i]) { 
                    // <== 备注: Java中，==用于比较对象的引用，而 equals() 用于比较字符串的内容。
                
                // if (!map.get(letter).equals(sWords[i])) {
                return false;
                }
            } else {
                if(!set.contains(sWords[i])) {
                map.put(letter, sWords[i]);
                set.add(sWords[i]);
                } else {return false;}

            }

        }

        return true;

        
    }
}
// @lc code=end

