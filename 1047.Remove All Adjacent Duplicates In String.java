/*
 * @lc app=leetcode id=1047 lang=java
 * @lcpr version=30104
 *
 * [1047] Remove All Adjacent Duplicates In String
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            //stack: {a}

            while (!stack.isEmpty() && c == stack.peek()) {
                stack.pop();
                continue;
            }
                            
            stack.push(c);
        }

        StringBuilder sb = new StringBuilder();

        for (Character c : stack) {
            sb.append(c);
        }

        return sb.toString();
        
    }
}
// @lc code=end



/*
// @lcpr case=start
// "abbaca"\n
// @lcpr case=end

// @lcpr case=start
// "azxxzy"\n
// @lcpr case=end

 */

