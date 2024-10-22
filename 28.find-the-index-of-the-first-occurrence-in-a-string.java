/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String

 solution:

1, corner cases: needle is an empty string, return 0; haystack.length() < needle.length(), return -1;

2, 两个for loop: i + j

e.g. short = "add", long = "cadd";

iterate in long string, when long.charAt[i] == short.charAt[0]; save i = startIndex

3, keep looping, if didnt break, return startIndex; 

4, else, return -1
 
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();

        if (n == 0) return 0; //可以问interviewer, n是空字符时,如何return
        if (m < n) return -1;

        for (int i = 0; i <= m - n; i++) { //遍历到蕞后n个数,就没必要继续遍历
            for (int j = 0; j <= n; j++) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                }

                if (j == n-1) return i; //说明遍历到了needle的蕞后一个数,可以return i
            }
        }

        return -1; 
    }

}
// @lc code=end

