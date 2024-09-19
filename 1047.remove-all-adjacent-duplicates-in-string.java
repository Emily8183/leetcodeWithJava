/*
 * @lc app=leetcode id=1047 lang=java
 *
 * [1047] Remove All Adjacent Duplicates In String
 * //以下没有直接用字符串模拟栈，以后再研究
 */

// @lc code=start
class Solution {
    public String removeDuplicates(String s) {
        Deque <Character> deque = new ArrayDeque<>();
        //ArrayDeque会比LinkedList在除了删除元素这一点外会快一点
        //参考：https://stackoverflow.com/questions/6163166/why-is-arraydeque-better-than-linkedlist

        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);

            if(deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            } else {
                deque.pop();
            };
        }

        //从栈到string
        StringBuilder sb = new StringBuilder();

        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        
        // 由于是从栈顶到栈底依次弹出字符，需要将结果字符串反转

        return sb.reverse().toString();
    }
}
// @lc code=end

