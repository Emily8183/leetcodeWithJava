/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) { //遍历到叶子节点，即可插入
            TreeNode node = new TreeNode(val);
            return node;
        }

        if (val < root.val) {
        root.left= insertIntoBST(root.left, val);
        } else if (val > root.val) {
        root.right = insertIntoBST(root.right, val); 
        }
        return root;
    }
}
// @lc code=end

