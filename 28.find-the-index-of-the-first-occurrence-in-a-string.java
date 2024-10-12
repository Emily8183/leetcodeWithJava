/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 //string s = "sadb"; String t = "sad"

 solution:
1, compare two strings and find the shorter one
2, iterate in both strings. 
2.1) if s.arr[i] == t.arr[j], index = i; keep looping until the end of t, retun index;
2.2) else, reset the index to 0, and keep interate
 
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {

    int haystackLength = haystack.length();

    int needleLength = needle.length();

    String longStr = "";
    
    String shortStr = "";

    if (haystackLength > needleLength) {
        longStr = haystack;
        shortStr = needle;
    } else {
        longStr = needle;
        shortStr = haystack;
    }

    for (int i = 0; i < longStr.length(); i++) {
        for (int j = 0; j < shortStr.length(); i++) {
            if (longStr[i] != shortStr[j]) {
                i++;
            }
        }
    }





        
    }
}
// @lc code=end

