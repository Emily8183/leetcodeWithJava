/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
 * solution:
 * 左最高+右最高=最长，
 * 3种情况的比较，a)经过根节点，b)左子树某节点，c)右子树某节点
 * 注意：在子树中（当root是在子节点上，而不是根节点）也有可能出现蕞大值，这个情况要考虑进去。所以这题虽然简单，其实有个陷阱。
 * 
 * 1）return的结果，要用Math.max进行比较
 * 2）往下递归的时候，深度如何叠加，return 1 + Math.max(getHeight(root.left), getHeight(root.right));
 
 * 
 */
class Solution {

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = dfs(root.left);
        int rightHeight = dfs(root.right);

        int leftMax = diameterOfBinaryTree(root.left);
        int rightMax = diameterOfBinaryTree(root.right);

        return Math.max(leftHeight+rightHeight, Math.max(leftMax, rightMax));

    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

// @lc code=end

