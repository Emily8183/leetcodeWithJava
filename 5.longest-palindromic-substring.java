/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        int maxLength = 1;
        int begin = 0;

        for ( int i = 0; i < s.length(); i++) {
            //if the palindrome is odd
          int oddLen = expandAroundCenter(s, i, i);
            //if the palindrome is even
          int evenLen = expandAroundCenter(s, i, i+1);

          int currentLen = Math.max(oddLen, evenLen);

            if (currentLen > maxLength) {
                maxLength = currentLen;
                begin = i-(maxLength-1)/2;
            }
          
        }
        return s.substring(begin, begin + maxLength);
        }

    //不断扩展,得出length
    private int expandAroundCenter(String s, int left, int right) {

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--; //left向左扩散
            right++; //right向右扩散
            //因此蕞后一次遍历满足回文串条件时，左--，右++，已经超出了回文串的范围
        }

        //这里所得出的回文串长度不包含left和right, 因此是right-left+1-2，也就是right-left-1
        return right-left-1;

    }
}
// @lc code=end

