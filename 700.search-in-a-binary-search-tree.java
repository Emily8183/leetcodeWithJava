/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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
    public TreeNode searchBST(TreeNode root, int val) {

        //递归法
       
            // if (root == null || root.val == val) {
            //     return root;
            // }

            // TreeNode result = null;

            // //利用二叉搜索树的特性，如果val<root.val，向左搜索，反之，向右搜索。
            // if (val < root.val) {

            //     result = searchBST(root.left, val);
            
            // } else {
            //     result = searchBST(root.right, val);
            // }

            // return result;

        //迭代法：充分利用二叉搜索树的特性
        while (root != null) {
            if (root.val < val) {
                root = root.right;
            } else if (root.val > val) {
                root = root.left;
            } else if (root.val == val) {
                return root;
            }
        }

        return null;
        
    }
        
}
// @lc code=end

