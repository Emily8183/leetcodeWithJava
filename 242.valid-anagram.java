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

        // if (s.length() != t.length()) return false;

        // Map<Character, Integer> map = new HashMap<>();

        // // for (int i = 0; i < s.length(); i++) {

        // //     char c = s.charAt(i);

        // //     if (!map.containsKey(c)) {
        // //         map.put(c,1);
        // //     } else {
        // //         map.put(c,map.get(c)+1);
        // //     }
        // // }

        // //optimize the above code
        // for (char c : s.toCharArray()) {
        //     map.put(c, map.getOrDefault(c,0)+1);
        // }

        // // for (int i = 0; i < t.length(); i++) {

        // //     char c = t.charAt(i);

        // //     if (!map.containsKey(c) || map.get(c) < 0) {
        // //         return false;
        // //     } 

        // //     map.put(c,map.get(c)-1);
        // // }

        // //optimize the above code
        // for (char c : t.toCharArray()) {
        //     if (!map.containsKey(c) || map.get(c) < 0) return false;

        //     map.put(c, map.get(c)-1);
        // }

        // for (int num : map.values()) {
        //     if (num != 0) {
        //         return false;
        //     }
        // }

        // return true;

        //Solution 2: ASCII code

        // set up an array to store the matching number to each letter
        // a - 0, b - 1, c - 2
        // initial value to each letter is 0
    
        int[] arr = new int[26];

        // loop in the first s, and add on the count
        for (int i = 0; i < s.length(); i++) {

            // char c = s.charAt(i);

            // int code = c-'a';

            // arr[code]++;

            arr[s.charAt(i)-'a']++;

        }

        // loop in the second t, and minus the count
        for (int i = 0; i < t.length(); i++) {

            // char c = t.charAt(i);

            // int code = c-'a';

            // arr[code]--;
            
            arr[t.charAt(i)-'a']--;
        }          

        // check if any arr[i] != 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
// @lc code=end

