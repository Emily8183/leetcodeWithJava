/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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

    // 普通的中序遍历，适合所有树

    // private HashSet<Integer> set = new HashSet<>();

    // public boolean findTarget(TreeNode root, int k) {

    //     //edge case
    //     if (root == null) return false;

    //     boolean leftRes = findTarget(root.left, k);

    //     if (set.contains(k-root.val)) return true;

    //     set.add(root.val);

    //     boolean rightRes = findTarget(root.right, k);

    //     return leftRes || rightRes;

    // }

    public boolean findTarget(TreeNode root, int k) {
}

}
// @lc code=end

