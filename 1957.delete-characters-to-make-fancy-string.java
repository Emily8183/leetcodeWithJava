/*
 * @lc app=leetcode id=1957 lang=java
 *
 * [1957] Delete Characters to Make Fancy String
 */

// @lc code=start
class Solution {
    public String makeFancyString(String s) {

        if (s.length() < 2) return s;

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
// @lc code=end

