/*
 * @lc app=leetcode id=113 lang=java
 *
 * [113] Path Sum II
 */

// @lc code=start
/**
 * Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 */


public class Solution {

    List<List<Integer>> result;
    LinkedList<Integer> path;
    public List<List<Integer>> pathSum (TreeNode root,int targetSum) {
        result = new LinkedList<>();
        path = new LinkedList<>();
        traversal(root, targetSum);
        return result;
    }
    private void traversal(TreeNode root,  int count) {
        if (root == null) return;
        path.offer(root.val);
        count -= root.val;
        if (root.left == null && root.right == null && count == 0) {
            result.add(new LinkedList<>(path));
        }
        traversal(root.left, count);
        traversal(root.right, count);
        path.removeLast(); // 回溯
    }
}
// @lc code=end

