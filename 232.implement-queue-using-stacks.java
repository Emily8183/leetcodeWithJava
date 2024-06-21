/*
 * @lc app=leetcode id=232 lang=java
 *
 * [232] Implement Queue using Stacks
push(x) -- 将一个元素放入队列的尾部。
pop() -- 从队列首部移除元素，不返回
top() -- 仅限c++，java内没有
peek() -- 返回队列首部的元素。
empty() -- 返回队列是否为空。
 */

// @lc code=start
class MyQueue {

    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    //initialize the data structurea here, stackIn and stackOut
    public MyQueue() {
        stackIn = new Stack<>();
        stackOut = new Stack<>();
        
    }
    
    //push element x to the back of queue;
    public void push(int x) {
        stackIn.push(x);
    }
    
    //remove the element from the front of queue and return that element.
    public int pop() {
        // check while stackOut is empty, move all elements from stackIn to stackOut
        if(stackOut.empty()) {
            while(!stackIn.empty()) {
                stackOut.push(stackIn.pop());
            }
        }
        
        return stackOut.pop();
    }
    
    //Get the front element(只查询数值，不弹出，所以还需要借助push来放回去)
    public int peek() {
        int res=this.pop();
        stackOut.push(res);
        return res;
        
    }
    
    public boolean empty() {
        return stackIn.empty() && stackOut.empty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

