/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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

    private TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {
        //先记录前一个节点
        {

            //如果根节点是空，说明是空树，满足所有二叉树条件，直接返回true
            if(root == null) return true;

            boolean left = isValidBST(root.left);

            if(pre !=null && pre.val >= root.val) return false;

            pre = root;

            boolean right = isValidBST(root.right);

            return left && right;

        }
        
    }
}
// @lc code=end

