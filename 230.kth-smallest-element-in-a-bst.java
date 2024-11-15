/*
 * @lc app=leetcode id=230 lang=java
 *
 * [230] Kth Smallest Element in a BST
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
    public int kthSmallest(TreeNode root, int k) {

        int leftCount = countNode(root.left);

        if (k <= leftCount) {
            return kthSmallest(root.left, k);
        } else if (k == leftCount + 1) { //第k个数是根节点
            return root.val;
        } else {
            return kthSmallest(root.right, k - leftCount -1);
        }
        
    }

    private int countNode(TreeNode node) {

        if (node == null) return 0;

        int leftCount = countNode(node.left);
        int rightCount = countNode(node.right);

        return 1 + leftCount + rightCount;

    }
}
// @lc code=end

