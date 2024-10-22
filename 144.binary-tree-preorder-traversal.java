/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start

import java.util.Stack;

import javax.swing.tree.TreeNode;

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

    //recursion
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     preorder(root,result);
    //     return result;    
    // }

    // public void preorder(TreeNode root, List<Integer> list) {
    //     if (root == null) {
    //         return;
    //     }

    //     list.add(root.val);
    //     preorder(root.left,list);
    //     preorder(root.right,list);
    // }

    //iterative
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return result; 

        stack.push(root); //不是root.val

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result.add(node.val); 

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }

        return result;

    }
}
// @lc code=end

