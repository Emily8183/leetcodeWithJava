/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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
    public int maxDepth(TreeNode root) {
        //递归
       if (root == null) return 0;

       int leftDepth = maxDepth(root.left) + 1;
       int rightDepth = maxDepth(root.right) + 1;

       return Math.max(leftDepth,rightDepth);

        //迭代法
        // if (root == null) return 0;

        // if (root.left == null && root.right == null) return 1; 

        // Queue<TreeNode> que = new LinkedList<>();

        // que.offer(root);

        // int depth = 0;

        // while (!que.isEmpty()) {

        //     int len = que.size();

        //     while (len > 0) {
                
        //         TreeNode temp = que.poll();
                    
        //             if (temp.left != null) {
        //                 que.offer(temp.left);
        //             } 
                    
        //             if (temp.right != null) {
        //                 que.offer(temp.right);
        //             }
        //         len--;
        //     }

        //     depth++;
        // }

        // return depth;
    }
}
// @lc code=end

