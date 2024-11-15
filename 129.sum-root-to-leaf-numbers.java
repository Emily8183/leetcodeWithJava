/*
 * @lc app=leetcode id=129 lang=java
 *
 * [129] Sum Root to Leaf Numbers
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
 * 
 * 自上往下遍历，到叶子节点为止，每个root.val的数值相加： root.val * 10
 * 
 */
class Solution {
    public int sumNumbers(TreeNode root) {

        return dfs(root, 0); //第一次调用前currentNumber应该是0
      
    }

    private int dfs(TreeNode node, int currentNumber) {
        //终止条件
        if (node == null) return 0;

        //求当年的数值
        currentNumber = currentNumber * 10 + node.val;

        //遇到叶子节点后，及时返回当前数字
        if (node.left == null && node.right == null) {
            return currentNumber;
        }

        //接住单层逻辑的结果，左右子树接住后相加
        return dfs(node.left, currentNumber) + dfs(node.right, currentNumber);


    }
}
// @lc code=end

