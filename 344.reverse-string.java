/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 */

// @lc code=start
class Solution {
    public void reverseString(char[] s) {
        reverse (s, 0, s.length-1);
        
    }

    private void reverse(char[] s,int left, int right) {
        if (s.length == 0) {
            return;
        }

       if (left >= right) {
        return;
       }

       char temp=s[left];
       s[left] = s[right];
       s[right] = temp;

       reverse(s, left+1, right-1);
    }
}
// @lc code=end

