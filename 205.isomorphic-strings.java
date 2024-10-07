/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 * 
 * //hashmap: key-value pair
 * //1, iterate, save the first pair of key and value, "egg" and "add", "e"-"a"
 * //2, make sure the same key will reflect the same value, otherwise false
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) return false;

        Map<Character, Character> map1 = new HashMap<>(); //to check from s to t
        Map<Character, Character> map2 = new HashMap<>(); //to check from tto s

        for (int i = 0; i < s.length(); i++) {
            
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        //check from s to t
        if (map1.containsKey(sChar) && tChar != map1.get(sChar)) return false;
        //check from t to s
        if (map2.containsKey(tChar) && sChar != map2.get(tChar)) return false;
        
        map1.put(sChar,tChar);
        map2.put(tChar,sChar);
        }

        return true;
        
    }
}
// @lc code=end

