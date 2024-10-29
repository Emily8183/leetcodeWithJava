/*
 * @lc app=leetcode id=100 lang=java
 *
 * [100] Same Tree
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //check the root first
        //if the root both are null, return true
        if (p == null && q == null) return true;

        //if one root is null, the other isnt, return false OR if both root arent null but valid are different, return false
        if (p == null || q == null) return false;

        if (p.val != q.val) return false;

        //recursion of the left and right tree
        boolean compareLeft = isSameTree(p.left, q.left);
        boolean compareRight = isSameTree(p.right, q.right);

        return compareLeft && compareRight;
    }
}
// @lc code=end

