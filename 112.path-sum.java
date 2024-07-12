/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
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
    public boolean hasPathSum(TreeNode root, int targetsum) {
         if (root == null) {
             return false;
         }

         targetsum -= root.val;
         // 每经过一个节点，targetsum中减去这个叶子节点的值


        //  在boolean函数中，检查 targetsum 是否等于 0，如果等于就返回 true，否则返回 false。
         if (root.left == null && root.right == null) {
             return targetsum == 0;
         }

         if (root.left != null) {
             boolean left = hasPathSum(root.left, targetsum);
             if (left) {      // 已经找到
                 return true;
             }
         }

         if (root.right != null) {
             boolean right = hasPathSum(root.right, targetsum);
             if (right) {     // 已经找到
                 return true;
             }
         }

         return false;
     }
 }

// @lc code=end

