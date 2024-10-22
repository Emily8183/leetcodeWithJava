/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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

    //Recursion:
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<>();
    //     postorder(root, result);
    //     return result; 
    // }

    // public void postorder(TreeNode root, List<Integer> list) {
    //     if(root == null) {
    //         return;
    //     }

    //     postorder(root.left, list);
    //     postorder(root.right, list);
    //     list.add(root.val);
    // }

    //Iterative:
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return result;

        stack.add(root);

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();

            result.add(node.val);

            if (node.left != null) {
                stack.push(node.left);
            }

            if (node.right != null) {
                stack.push(node.right);
            }

        }

        Collections.reverse(result);

        return result;

    }

}
// @lc code=end

