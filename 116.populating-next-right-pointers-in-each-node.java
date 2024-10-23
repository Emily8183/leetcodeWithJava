/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        

        if(root == null){
            return null;
        }

        connectNode(root.left, root.right);
        return root;
    }

    private void connectNode(Node left, Node right){
        if(left == null || right == null) {
            return; //说明不满足perfect binary tree的条件
        }

        //根据题目要求，populate next right pointers in each node
        //用前序遍历，先要把左节点和右节点相连
        left.next = right;

        //递归处理左子树内部的连接
        connectNode(left.left, left.right);

        // 递归处理右子树内部的连接
        connectNode(right.left, right.right);

        // 连接相邻子树的节点
        connectNode(left.right, right.left);
    
    }
}



        

// @lc code=end

