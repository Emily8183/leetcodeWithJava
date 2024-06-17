/*
 * @lc app=leetcode id=225 lang=java
 *
 * [225] Implement Stack using Queues
 * 
 */

// @lc code=start
class MyStack {

    Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
        
    }
    
    public void push(int x) {
        queue.add(x);
        
    }
    
    public int pop() {
        rePosition();
        return queue.poll();
        //.poll()是移除并返回队列的头元素。比如队列 queue 包含元素 3，1，2（reposition以后的新顺序），队列的状态将变为 1，2，pop()的返回值是3
    }
    
    public int top() {
        rePosition();
        //比如队列是123，通过rePosition函数，队列变为3，1，2
        int result = queue.peek();
        //.peek()是返回队列的头元素。队列保持为3，1，2，peek的返回值是 3。
        queue.add(queue.poll());
        //因为不弹出，要回归到原本队列的顺序，需要把3移到队尾，变回123
        return result;
        //这里的result是3
        
    }
    
    public boolean empty() {
        return queue.isEmpty();
        
    }

    public void rePosition(){
        int size =queue.size();
        size--;
        while(size -->0) {
            queue.add(queue.poll());
        }
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
// @lc code=end

