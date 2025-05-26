/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree 对称
 * 把左树的左节点和右树的右节点比较
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
    public boolean isSymmetric(TreeNode root) {

        if (root == null) return true;

        return comparison(root.left, root.right);
    }

    public boolean comparison(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;

        if (left == null || right == null || left.val != right.val) return false;

        return comparison(left.left, right.right) && comparison(left.right, right.left);


    }
}
// @lc code=end

