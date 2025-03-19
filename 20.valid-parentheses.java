/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

condition: String s = "", '(', ')', '{', '}', '[' and ']'. for example：s = "()[]{}", s = "([])"
goal: isValid: t/f
solution:stack

Syntax: s.charAt(i), char ''，not ""
 * 
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        //edge
        if (s.length() == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i <= s.length()-1; i++) {

            char c = s.charAt(i);

            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else {
                if (stack.isEmpty() || c != stack.peek() ) return false;

                stack.pop(); //这是关键的一步
            }

        }

        return stack.isEmpty();
    }
}
// @lc code=end

