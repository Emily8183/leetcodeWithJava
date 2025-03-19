/*
 * @lc app=leetcode id=1249 lang=java
 * @lcpr version=30103
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 * 1) 如果没有左括号，跳过右括号不要加；
 * 2）如果有左括号，记录出现的次数，超过这个数字的右括号不要加
 * 3）蕞后，如果有多余的左括号，把string翻转过来去除多余的左括号
 * 
 */

// @lc code=start
class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        
        int leftCount = 0;

        for (Character c : s.toCharArray()) {
            if (c == '(') {
                sb.append(c);
                leftCount++;
            } else if (leftCount > 0 && c == ')') {
                sb.append(c);
                leftCount--;
            } else if (c != ')') {
                sb.append(c);
            }
        }

        //蕞后检查是否有多余的“("
        if (leftCount > 0) {
            StringBuilder result = new StringBuilder();

            for (int i = sb.length()-1; i >= 0; i--) {
                if (sb.charAt(i) == '(' && leftCount > 0) {
                    leftCount--;
                    continue;
                }

                result.append(sb.charAt(i));
            } 

            return result.reverse().toString();

        }

        return sb.toString(); //没有多余的"("
 
    }
}


// @lc code=end



/*
// @lcpr case=start
// "lee(t(c)o)de)"\n
// @lcpr case=end

// @lcpr case=start
// "a)b(c)d"\n
// @lcpr case=end

// @lcpr case=start
// "))(("\n
// @lcpr case=end

 */

