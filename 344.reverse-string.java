/*
 * @lc app=leetcode id=344 lang=java
 *
 * [344] Reverse String
 * goal: reverses a string, s = ["h","e","l","l","o"]
 */

// @lc code=start

//
class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    
    }

    private void reverse(char[] s, int left, int right) {

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

    }

}
      
        
// @lc code=end

