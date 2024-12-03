/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 * 
 * //遍历到最后如果还有/，去掉
 * //遍历到多个/, 保留第一个，剩下的skip
 * //遍历到../，stack弹出 (照顾/../的情况)
 * //保留/.../
 * //stringbuilder
 * //遍历到最后一个，去掉/,不需要额外操作，不加到栈里就可以. if (c == "/" &&后面也是//) continue
 *
 */

// @lc code=start

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] components = path.split("/");

        for(String component : components) { 

            if (component.isEmpty() || component.equals(".")) continue;

            if (component.equals("..")) { //前一个不是null的话
                if (!stack.isEmpty()) {
                    stack.pop();
                 } 

                continue;
            } 

            stack.push(component);

        }

        
        StringBuilder result = new StringBuilder();

        // 把stack转为string
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() > 0 ? result.toString() : "/";
        
    }
}
// @lc code=end

