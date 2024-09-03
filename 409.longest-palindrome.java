/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        //use hashset

        HashSet<String> set = new HashSet<String>();
        char[] arr = s.toCharArray();

        int result = 0;

        for (char c : arr) {
            if() {
                //find c in set
            arr.remove(c);
            result +=2;
            } else{
                arr.add(c);
            }
        }


        
        
        
    }
}
// @lc code=end

