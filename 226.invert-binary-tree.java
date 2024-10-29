/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        //递归法
        // if ( root == null) return root;

        // TreeNode temp = root.left;
        // root.left = root.right;
        // root.right = temp;

        // invertTree(root.left);
        // invertTree(root.right);

        // return root;

        //迭代法

        if (root == null) return root;

        Queue<TreeNode> que = new LinkedList<>();

        if (root != null) que.offer(root);

        while(!que.isEmpty()) {
            int len = que.size();
            TreeNode temp = que.poll();
            invert(temp);

            if (temp.left != null) que.offer(temp.left);
            if (temp.right != null) que.offer(temp.right);

            len--;

        }

        return root;
    }

    private void invert (TreeNode node) {
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }
}
// @lc code=end

