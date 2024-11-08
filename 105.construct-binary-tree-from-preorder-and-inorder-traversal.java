/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;

        return helper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode helper (int[] preorder, int startPreorder, int endPreorder, int[] inorder, int startInorder, int endInorder) {
        if (startPreorder >= endPreorder || startInorder >= endInorder) return null;
        
        int rootVal = preorder[startPreorder];

        TreeNode root = new TreeNode(rootVal);

        int middleIndex = 0;

        for(middleIndex = startInorder; middleIndex < endInorder; middleIndex++) {
            if (inorder[middleIndex] == root.val) break; //找到middleIndex即可
        }

        int startleftInorder = startInorder;
        int endleftInorder = middleIndex;
        int startrightInorder = middleIndex+1;
        int endrightInorder = endInorder;

        int leftTreeSize = middleIndex - startInorder;

        int startleftPreorder = startPreorder + 1;
        int endleftPreorder = startleftPreorder + leftTreeSize;
        int startrightPreorder = endleftPreorder;
        int endrightPreorder = endPreorder;

        root.left = helper(preorder, startleftPreorder, endleftPreorder, inorder, startleftInorder, endleftInorder);
        root.right = helper(preorder, startrightPreorder, endrightPreorder, inorder, startrightInorder, endrightInorder);

        return root;

    }
}
// @lc code=end

