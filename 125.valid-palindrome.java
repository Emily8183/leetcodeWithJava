/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
condition: String s, upper -> lower, remove all non-alphanumeric
goal: bool
solution: two ptrs
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // s = "race a car"
        //     left    right

        int left = 0;
        int right = s.length()-1;

        while (left <= right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                right--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }

            left++;
            right--;
            }

        }

        return true;
    }

}
// @lc code=end

