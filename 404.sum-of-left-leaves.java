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
       //终止条件

       if (root == null) return 0;

       //定义左子树中左叶子的总和
       int valueOfLeftTree = sumOfLeftLeaves(root.left);
       //定义右子树中左叶子的总和
       int valueOfRightTree = sumOfLeftLeaves(root.right);

       //midValue 是一个临时变量，用于存储当前节点左叶子节点的值。
       int midValue = 0;

       if(root.left != null && root.left.left == null && root.left.right == null) {
            midValue = root.left.val;
       }

       int sum = midValue + valueOfLeftTree + valueOfRightTree;
       return sum;

        }
    }
        
 
// @lc code=end

