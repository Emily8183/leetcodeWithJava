/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 * 
 * condition: String s, 
 * goal: boolean, true if its palindrome or after deleting at most one element
 * 
 * solution: two pointer
 * 1, left, right pointer
 * 2, if false, delete either left or right, check again
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return palindrome(s, left+1, right) || palindrome(s, left, right-1);
            }

            left++;
            right--;
        }

        return true;

    }

    private boolean palindrome(String s, int left, int right) {
              
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
               return false;
            }

            left++;
            right--;   
        }

        return true;
    }
    
    }
// @lc code=end

