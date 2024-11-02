/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>(); //嵌套的列表结构

        List<Integer> path = new ArrayList<>();

        helper(root, targetSum, list, path);

        return list;
    }

    private void helper(TreeNode node, int target, List<List<Integer>> list, List<Integer> path) {

        if (node == null) return;

        target -= node.val;
        path.add(node.val);

        if (node.left == null && node.right == null && target == 0) {
            list.add(new ArrayList<>(path));
        }

        helper(node.left, target, list, path);
        helper(node.right, target, list, path);

        path.remove(path.size()-1);//回溯需要放在递归后面

    }
}
// @lc code=end

