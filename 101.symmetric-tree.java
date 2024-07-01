/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if(left == null && right != null) {
            return false;
        } 
        if(left != null && right == null) {
            return false;
        }
        if(left == null & right == null) {
            return true;
        } 
        if (left.val != right.val) {
            return false;
        }

        boolean compareOuter = compare(left.left, right.right);
        boolean compareInner = compare(left.right, right.left);
        return compareOuter && compareInner;
        
    }
}
// @lc code=end

