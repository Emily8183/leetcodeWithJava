/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
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
 * Solution: 1) recursion, 2) iterative
 */

class Solution {

    //解法2： 迭代法
    public TreeNode convertBST(TreeNode root) {

        if (root == null) return root;

        Stack<TreeNode> stack = new Stack<>();

        int total = 0;

        TreeNode cur = root;

        while (!stack.isEmpty() || cur != null) {
            while (cur != null) { //先查看右
                stack.push(cur);
                cur = cur.right;
            }

            cur = stack.pop();

            total += cur.val;

            cur.val = total; //更新数值

            cur = cur.left; //查看左
        }

        return root;

       
    }

}
// @lc code=end

