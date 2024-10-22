/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
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
 * solution: use queue
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        Queue<TreeNode> que = new LinkedList<TreeNode>();

        if (root == null) return list;

        que.offer(root);

        while(!que.isEmpty()) {
            int len = que.size();

            for (int i = 0; i < len; i++) {
                TreeNode temp = que.poll();
                if (i == len-1) {
                    list.add(temp.val);
                }

                if (temp.left != null) que.offer(temp.left);

                if (temp.right != null) que.offer(temp.right);
            }
        }

        return list;
        
    }
}
// @lc code=end

