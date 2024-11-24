/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        //if negative number, return false;
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        //得出这个数字是几位数
        int div = 1;
        while (x >= 10 * div) {
            div *= 10;
        }

        //判断蕞左边数字和蕞右边数字是否相等，while loop, 如果不等，return false
        int left = 0;
        int right = 0;

        while (x > 0) {
            left = x / div;
            right = x % 10;

            if (left != right) return false;

            x = (x % div) / 10; 

            div = div / 100; //因为少了两位

        }

        return true;

        //如果相等，就chop左右，直至没有数字，return true


        
    }
}
// @lc code=end

