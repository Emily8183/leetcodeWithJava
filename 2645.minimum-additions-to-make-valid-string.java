/*
 * @lc app=leetcode id=2645 lang=java
 *
 * [2645] Minimum Additions to Make Valid String
 */

// @lc code=start
class Solution {
    public int addMinimum(String word) {
    
    Stack<Character> stack = new Stack<>();

    int count = 0;

    for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);
        stack.push(ch);
    }

    while (!stack.isEmpty()) {

        if (stack.peek() == 'c') {
            stack.pop();
        } else {
            count++;
        }

        if(!stack.isEmpty() && stack.peek() == 'b') {
            stack.pop();
        } else {
            count++;
        }

        if(!stack.isEmpty() && stack.peek() == 'a') {
            stack.pop();
        } else {
            count++;
        }
    }

    return count;

        
    }
}
// @lc code=end

