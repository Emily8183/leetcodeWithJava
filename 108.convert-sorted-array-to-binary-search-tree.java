/*
 * @lc app=leetcode id=108 lang=java
 *
 * [108] Convert Sorted Array to Binary Search Tree
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
    public TreeNode sortedArrayToBST(int[] nums) {
       return traversal(nums, 0, nums.length-1);
        
    }

        // 左闭右闭区间[left, right]
        private TreeNode traversal(int[]nums, int left, int right) {
            if(left>right) return null;

            int mid = left+((right-left)/2);

            TreeNode root = new TreeNode(nums[mid]);

            root.left = traversal(nums, left, mid-1);
            root.right = traversal(nums, mid+1, right);

            return root;
        }
}
// @lc code=end

