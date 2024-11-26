/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {

        int index = 0;
        int sign = 1;
        long sum = 0;

        //trim space;
        s = s.trim();

        if (s == null || s.length() == 0) return 0;

        //判断是正数还是负数
        if (s.startsWith("-")) {
           sign = -1;
           index++;
        } else if (s.startsWith("+")) {
           sign = 1;
           index++;
        }

        for (int i = index; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return (int) sum * sign; //sum will be 0, so return 0
            }

            sum = sum * 10 + s.charAt(i) -'0'; //叠加出个、十、百、千等

            //in the loop,做好判断
            if (sign == 1 && sum > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (sign == -1 && (-1)*sum < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) sum * sign;


        
    }

}
// @lc code=end

