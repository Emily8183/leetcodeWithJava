/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {

        Set<Character> hashset = new HashSet<>();
        //处理的是字符，因此是Character而不是String

        char[] arr = s.toCharArray();

        int result = 0;

        for(char letter: arr){

        
            if(!hashset.contains(letter)){
                hashset.add(letter);
           
            } else{
                hashset.remove(letter);
                result+=2;
            }
        }

        if(hashset.size() >0) result+=1;

    return result;
    }
}
// @lc code=end

