/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 * 
情况1:
// or /// = >  /

情况2: 
. : 可省略,但不需要弹出previous directory

情况2:
.. => previous directory => stack.pop() 

情况3:
如果蕞后为空,需要加上root directory

注意:
// } else if (component.equals("..") && !stack.isEmpty()) { 
//合并后的 else if 语句不会执行 pop()（因为 !stack.isEmpty() 不满足），但它也不会继续到 else 逻辑，而是 直接跳过当前循环，进入下一个 component 处理。
 *
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {

        String[] components = path.split("/");

        Stack<String> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        for (String component : components) {
            if (component.equals("") || component.equals(".") ) {
                continue;
                
            } else if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(component);
            }            
        }

        for (String s : stack) {
            sb.append("/").append(s);
        }

        return sb.isEmpty() ? "/" : sb.toString();
        
    }
}
// @lc code=end

