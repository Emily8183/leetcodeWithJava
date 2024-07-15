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

       //使用后序遍历：左右中（=左右根节点）
       //定义左子树中左叶子的总和
       int valueOfLeftTree = sumOfLeftLeaves(root.left);

       if(root.left != null && root.left.left == null && root.left.right == null) {
            valueOfLeftTree= root.left.val;
       }

        //定义右子树中左叶子的总和
       int valueOfRightTree = sumOfLeftLeaves(root.right);

       //中
       int sum = valueOfLeftTree + valueOfRightTree;
       return sum;

    }
}
        
 
// @lc code=end

