/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
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
    public int minDepth(TreeNode root) {

       if (root == null) return 0;

       int leftDepth = minDepth(root.left);
       int rightDepth = minDepth(root.right);

        //处理如果只有一个子树存在，应该返回非空子树的 minDepth + 1
        if(root.left == null) return rightDepth + 1;
        if(root.right == null) return leftDepth + 1;

        return Math.min(leftDepth, rightDepth) + 1;


        //迭代法：
        // if (root == null) return 0;

        // if (root.left == null && root.right == null) return 1;

        // int depth = 0;

        // Queue<TreeNode> que = new LinkedList<>();

        // que.offer(root);

        // while (!que.isEmpty()) {
        //     int len = que.size();
        //     depth++;

        //     while (len > 0) {

        //         TreeNode temp = que.poll();

        //         if (temp.left == null && temp.right == null) {
        //             return depth;
        //         }

        //         if (temp.left != null) que.offer(temp.left);
        //         if (temp.right != null) que.offer(temp.right);

        //         len--;
        //     }

        // }

        // return depth;

        
    }
}
// @lc code=end

