/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 * 创造一个辅助stack MinStack，用来同步储存最小值
 */

// @lc code=start

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        stack.push(val);
        if (val <= min) {
            minStack.push(val);
            min = val;
        }
    }
    
    public void pop() {
        int popedValue = stack.pop();
        if (popedValue == min) {

            minStack.pop();

            if (!minStack.isEmpty()) {
                min = minStack.peek();
            } else {
                min = Integer.MAX_VALUE; //重置最小值
            }
            
        }
        
    }
    
    public int top() {
        int value = stack.peek();
        return value;
        
    }
    
    public int getMin() {

        return min; 
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

