/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        int result = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int value = map.get(letter);

            if (i+1 < s.length() && value < map.get(s.charAt(i+1))) {
                result -= value;
            } else {
                result += value;
            }
        }

        return result;

        
    }
}
// @lc code=end

