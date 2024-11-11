/*
 * @lc app=leetcode id=783 lang=java
 *
 * [783] Minimum Distance Between BST Nodes
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

    private TreeNode pre = null; //必须设置成类

    private Integer res = 0;

    private Integer minimum = Integer.MAX_VALUE;


    public int minDiffInBST(TreeNode root) {

       countMin(root);

       return minimum;
    }

    private void countMin(TreeNode node) {

        if (node == null) return;

        countMin(node.left);

        if (pre != null) {
            res = node.val - pre.val;
            minimum = Math.min(minimum,res);
        }

        pre = node;

        countMin(node.right);

    }
}
// @lc code=end

