/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import javax.swing.tree.TreeNode;

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

    public List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) {
            return resList;
        }

        queueResult(root);

        return resList;
        
    }

    public void queueResult(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(node);

        while(!queue.isEmpty()) {

            int size = queue.size();

            List<Integer> currentLevel = new ArrayList<>();

            while (size-- > 0) {

                TreeNode temp = queue.poll();

                currentLevel.add(temp.val);

                if(temp.left !=null) {
                    queue.offer(temp.left);
                }

                if(temp.right!=null) {
                    queue.offer(temp.right);
                }

            }

            resList.add(currentLevel);
        }


    }
}
// @lc code=end

