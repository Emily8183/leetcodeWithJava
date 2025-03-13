/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 * 1）convert letter to int[] count via Ascii
 * 
 * int[] count = new int[26];
 * 
 * "eat" => [1, 0,0,0,1,        1]
 *           0, 1,2,3,4,
 * 
 * String pattern = Arrays.toString()
 * 
 * 2) Map：key - pattern, value: List<String> letters
 * 
 * 3) return map.values()
 * 
 * 
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            int[] counts = new int[26];

            for (char c : word.toCharArray()) {

                counts[c-'a']++;
            }

            String pattern = Arrays.toString(counts);

            map.putIfAbsent(pattern, new ArrayList<>());
            map.get(pattern).add(word);
           
        }

        return new ArrayList<>(map.values());



     }
}
// @lc code=end

