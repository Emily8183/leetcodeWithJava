/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 * 
 * /*
 * int[] temperatures <= daily temp
 * goal: return int[] answer, answer[i] = the nearest higher number - current num, if none, answer[i] == 0;
 * solution: stack
 */
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //iterate and add the number to stack,
        Stack<Integer> stack = new Stack<>();

        int[] difference = new int(temperatures.length);

        stack.push(temperatures[0]);

        for (int i = 1; i < temperatures.length; i++) {

            if (temperatures[i] > stack.peep()) {
                stac
            }

        }
        //if num > stack.pop(), calculate the index difference, add to the new array
        //else, move forward
        
    }
}
// @lc code=end

