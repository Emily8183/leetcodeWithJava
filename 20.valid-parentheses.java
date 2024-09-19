/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new LinkedList<>(); //双端队列

        if (s.length() %2 !=0){
            return false;
        }

        for (int i=0; i < s.length(); i++ ) {
            char ch = s.charAt(i);

            if(ch == '(') {
                stack.push(')');
            } else if (ch=='{') {
                stack.push('}') ;
            } else if (ch == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != ch) {
                return false;
            } else {
                stack.pop();
            } 
        }

        return stack.isEmpty();
        
    }
}
// @lc code=end

