/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
 * solution:
 * 1, traverse the tree, when meets the first null, len 
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

import java.util.Queue;

import org.w3c.dom.Node;

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> finalList = new ArrayList<>();
        //Java 7 以后都可以简化为List<List<Integer>> resList = new ArrayList<>(); 钻石操作符（Diamond Operator）

        if(root == null) return finalList;

        Queue<Node> que = new LinkedList<>();

        que.offer(root);

        while (!que.isEmpty()) {
            List<Integer> levelList = new ArrayList<>();
           
            int len = que.size();

            for (int i = 0; i < len; i++) {
                Node temp = que.poll();
                if (temp == null) continue;

                levelList.add(temp.val);

                for (Node child : temp.children) {
                    que.offer(child);
                }              

                
            }

            finalList.add(levelList);

        }

        return finalList;

    }
}
// @lc code=end

