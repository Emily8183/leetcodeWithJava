/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start

import java.util.Stack;

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
    public List<Integer> preorderTraversal(TreeNode root) {
        //recursion
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        return res;

    }

    private void traverse(TreeNode root, List<Integer> list) {

        if (root == null) return;

        list.add(root.val);
        traverse(root.left, list);
        traverse(root.right, list);
    }

}
// @lc code=end

