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
 * 左最深+右最深=最长，
 * 递归：前序
 * 中: int depth = 0; if (root == 0) return 0; 
 * 
 * 注意：在子树中（当root是在子节点上，而不是根节点）也有可能出现最大值，这个情况要考虑进去。所以第一次写的代码需要改
 * 1）return的结果，要用Math.max进行比较
 * 2）往下递归的时候，深度如何叠加，return 1 + Math.max(getHeight(root.left), getHeight(root.right));
 *
 * 
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        int maxLeftDepth = diameterOfBinaryTree(root.left);
        int maxRightDepth = diameterOfBinaryTree(root.right);

        return Math.max((left+right), Math.max(maxLeftDepth, maxRightDepth));
        
    }

    private int getHeight(TreeNode node) {
        if (node == null) return 0;

        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
}
// @lc code=end

