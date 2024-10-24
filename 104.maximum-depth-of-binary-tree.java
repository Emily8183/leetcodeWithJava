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
        // if(root == null) return 0;
        //节点为空时，高度为零

        //使用后序遍历法，左右中
        // int left = maxDepth(root.left);
        // int right = maxDepth(root.right);
        // int maxHeight = Math.max(left,right) + 1;
        //确定单层递归的逻辑：
        //先求它的左子树的深度，再求右子树的深度，最后取左右深度最大的数值
        //再+1 （加1是因为算上当前中间节点）就是目前节点为根节点的树的深度。

        // return maxHeight;

        //迭代法
        if (root == null) return 0;

        Queue<TreeNode> que = new LinkedList<>();

        que.offer(root);

        int depth = 0;

        while (!que.isEmpty()) {

            int len = que.size();

            while (len > 0) {
                TreeNode temp = que.poll();
                    
                    if (temp.left != null) {
                        que.offer(temp.left);
                    } 
                    
                    if (temp.right != null) {
                        que.offer(temp.right);
                    }
                len--;
            }
            depth++;
        }

        return depth;
    }
}
// @lc code=end

