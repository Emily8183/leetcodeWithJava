/*
 * @lc app=leetcode id=103 lang=java
 *
 * [103] Binary Tree Zigzag Level Order Traversal
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();

        if (root == null) return list;

        Queue<TreeNode> queue = new LinkedList<>();

        Stack<TreeNode> stack = new Stack<>();

        boolean leftToRight = true;

        queue.offer(root);

        while (!queue.isEmpty()) {

            int length = queue.size();
            List<Integer> level = new ArrayList<>();

            while (length > 0) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    level.add(node.val);
                } else {
                    stack.push(node);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                length--;
            }

            if (!leftToRight) {
                while(!stack.isEmpty()) {
                    level.add(stack.pop().val);
                }
            }

            list.add(level);
            leftToRight = !leftToRight;
        }

        return list;
    }
}
// @lc code=end

