/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
  
          if (root == null) return 0;
  
          int leftSum = sumOfLeftLeaves(root.left); //左子树的左叶子之和
          int rightSum = sumOfLeftLeaves(root.right); //右子树的右叶子之和
  
          //判断叶子节点
          if (root.left != null && root.left.left == null && root.left.right == null) {
            leftSum += root.left.val;//左叶子的值不断叠加
          }
  
          int sum = 0;
          sum = leftSum + rightSum;
  
          return sum;
      }
  }
        
 
// @lc code=end

