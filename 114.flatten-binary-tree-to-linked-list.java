/*
 * @lc app=leetcode id=114 lang=java
 *
 * [114] Flatten Binary Tree to Linked List
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 * 
 * 只要有左孩子,就一直加,直到没有,开始加右孩子
 * 中左右
 *
 * 注意:不能新建LinkedList,必须in place
 * 递归法:把左孩子塞到root和右孩子中间,依次类推
 */
class Solution {

    public void flatten(TreeNode root) {

        // LinkedList<TreeNode> list = new LinkedList<>(); //不能新建LinkedList,必须in place
        dfs(root); 
        //dfs辅助函数在原地修改树的结构，将每个节点的左子树移到右侧并形成一个链表结构. flatten 函数的作用只是启动 dfs，不需要也不使用 dfs 的返回值。

    }

    private TreeNode dfs(TreeNode node) {
        if (node == null) return null;

        TreeNode leftTail = dfs(node.left); //左子树的尾节点
        TreeNode rightTail = dfs(node.right);

        if (node.left != null) {
            leftTail.right = node.right; // 将左子树的尾节点连接到右子树的开头
            node.right = node.left;  // 将左子树放到右边
            node.left = null; //清空左子树
        }

        return rightTail != null ? rightTail : (leftTail != null ? leftTail : node);

    }
}
// @lc code=end

