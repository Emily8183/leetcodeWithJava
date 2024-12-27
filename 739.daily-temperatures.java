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


// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //iterate and add the number to stack,
        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[temperatures.length];
        // no need to define the last index, the initial value is 0 for each index

        for (int i = 0; i < temperatures.length; i++) {

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prev = stack.pop();
                answer[prev] = i - prev;
            } 
            stack.push(i);

        }
        
        return answer;
            
        
    }
}
// @lc code=end

