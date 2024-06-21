/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList();

        for (String s:tokens) {


            if("+".equals(s)) {
                //这里不用s.eqauls("+")是因为万一s为null，则会引发NullPointerException。例如，如果s是从外部输入，或者第三方库返回，没有进行充分检查，则可能为null
                stack.push(stack.pop()+stack.pop());
            }
            
            else if("-".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(-temp1+temp2);
            }

            else if("*".equals(s)) {
                stack.push(stack.pop()*stack.pop());
            }

            else if("/".equals(s)) {
                int temp1 = stack.pop();
                int temp2 = stack.pop();
                stack.push(temp2/temp1);
            } else {
                stack.push(Integer.valueOf(s));
                //把最后的结果转为integer数值
            }
        }

        return stack.pop();

        
    }
}
// @lc code=end

