/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import java.util.Deque;
import java.util.Queue;

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

    List<List<Integer>> resList = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {

        queueResult(root);

        return resList;
    }

    public void queueResult(TreeNode node) {

       if (node == null) return;

       Queue<TreeNode> que = new LinkedList<>();
       que.offer(node);

       while (!que.isEmpty()) {
            int len = que.size();

            List<Integer> list = new ArrayList<>();

            while (len > 0) {
              
                TreeNode temp = que.poll();

                list.add(temp.val);

                if (temp.left != null) que.offer(temp.left);
                if (temp.right != null) que.offer(temp.right);

                len--;

            }

            resList.add(list);

       }

       


    }
}
// @lc code=end

