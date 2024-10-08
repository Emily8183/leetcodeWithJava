/*
 * @lc app=leetcode id=538 lang=java
 *
 * [538] Convert BST to Greater Tree
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

    int sum;
    public TreeNode convertBST(TreeNode root) {

        sum =0;
        
        convertBST1(root);
        return root;
    }


        private void convertBST1(TreeNode root) {
            if(root == null) {
                return;
            }

            // 反中序遍历
            convertBST1(root.right);
            sum+= root.val;
            root.val=sum;
            convertBST1(root.left);

        }
}
// @lc code=end

