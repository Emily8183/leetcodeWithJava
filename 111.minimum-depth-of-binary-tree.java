/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        //当节点为0时，没有高度，因此返回0

        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);

        
        if(root.left == null && root.right != null) {
            return rightHeight + 1;
        }

        if(root.left != null && root.right == null) {
            return leftHeight + 1;
        }

        //处理中间
        int minHeight = Math.min(leftHeight, rightHeight);

        return minHeight + 1;
        
    }
}
// @lc code=end

