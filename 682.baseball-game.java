/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) { //operations[i] == "C"，String之间的比较用.equals
                stack.pop();
            } else if (operations[i].equals("D")) {
                int doubleNum = stack.peek() * 2; //not pop()
                stack.add(doubleNum);
            } else if (operations[i].equals("+")) {
                int add1 = stack.pop();
                int add2 = stack.pop();
                stack.add(add2);
                stack.add(add1);
                stack.add(add1+add2);
            } else {
                stack.add(Integer.valueOf(operations[i]));
            }
        }
        
        int result = 0;
        for(int num : stack) {
            result += num;
        }

        return result;
    }
}
// @lc code=end

