/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 * 
 *
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
    //     List<Integer> res = new ArrayList<>();
    //     traverse(root, res);

    //     return res;
    // }

    // private void traverse(TreeNode root, List<Integer> list) {
    //     if (root == null) return; 

    //     traverse(root.left,list);
    //     list.add(root.val);
    //     traverse(root.right,list);

    //Solution 2: stack (manual recursion)
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                res.add(cur.val);
                cur = cur.right;
            }
        }
        
        return res;

    }
}


// @lc code=end

