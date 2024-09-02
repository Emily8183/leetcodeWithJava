/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

//  

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        //先转化为数组

        char[] chars = s.toCharArray();

        return reverseString(chars, 0, chars.length-1);
        
    }

    private boolean reverseString(char[] arr, int start, int end){

       //以下的while条件已经包含了终止条件

        while(start<end) {
            while(start<end && !alphaNum(arr[start])) {
                start++;
            }

            while(end>start && !alphaNum(arr[end])){
                end--;
            }

            if(Character.toLowerCase(arr[start]) != Character.toLowerCase(arr[end])){
                return false;
            }

            start++;
            end--;

        }

        return true;
    }

        private boolean alphaNum(char c){
            return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
            // 或者直接使用库函数return Character.isLetterOrDigit(c);
        }



    
}
// @lc code=end

