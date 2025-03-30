/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 * 
 * 中序遍历，可以用递归遍历栈，也可以手动遍历栈
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
    public List<Integer> inorderTraversal(TreeNode root) {
        //Solution 1: Recursion
        List<Integer> res = new ArrayList<>();
        traverse(root, res);

        return res;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) return; 

        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);

    }
}


// @lc code=end

