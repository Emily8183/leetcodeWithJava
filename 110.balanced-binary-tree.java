/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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
    public boolean isBalanced(TreeNode root) {

        boolean[] isBalanced = new boolean[]{true};//默认长度为1,也可以写成boolean[] isBalanced = {true};
        checkBalanced(root, isBalanced);
        return isBalanced[0];

    }

    public int checkBalanced(TreeNode root, boolean[] isBalanced) {

        if (root == null) return 0;

        int leftHeight = checkBalanced(root.left, isBalanced);
        int rightHeight = checkBalanced(root.right, isBalanced);

        if (Math.abs(leftHeight-rightHeight) > 1) isBalanced[0] = false; //这里只需要修改boolean值,并不需要返回中断递归

        return Math.max(leftHeight,rightHeight) + 1;
    }
}
// @lc code=end

