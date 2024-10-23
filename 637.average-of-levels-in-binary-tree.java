/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
 */

// @lc code=start

import java.util.Queue;

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
 * solution:
 * 1, queue, add all the nodes on each level to the queue
 * 2, length = queue.size();
 * 3, add the values of all the nodes to sum
 * 4, double result = sum / length 
 * 
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();

        Queue<TreeNode> que = new LinkedList<TreeNode>();

        que.offer(root);

        while (!que.isEmpty()) {
            int len = que.size();
            double sum = 0;

            for (int i = 0; i < len; i++) { //control that exactly "len" nodes are processed
                TreeNode temp = que.poll();

                if (temp.left != null) que.offer(temp.left);
                if (temp.right != null) que.offer(temp.right);

                sum += temp.val; //sum must be double to match average
            }

            double average = sum / len;
            list.add(average);
         
        }

        return list;
        
    }
}
// @lc code=end

