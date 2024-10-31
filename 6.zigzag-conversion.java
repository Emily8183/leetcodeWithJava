/*
 * @lc app=leetcode id=6 lang=java
 *
 * [6] Zigzag Conversion
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();

        int len = c.length;

        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        int index = 0;

        while (index < len) {
            //自上往下串联,包含第一行和蕞后一行
            for (int i = 0; i < numRows && index < len; i++) {
                sb[i].append(c[index++]);
            } 

            for (int i = numRows-2; i >= 1 && index < len; i--) {
                sb[i].append(c[index++]);
            }
        }

        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }

        return sb[0].toString();
        
    }
}
// @lc code=end

