/*
 * @lc app=leetcode id=222 lang=java
 *
 * [222] Count Complete Tree Nodes
 */

// @lc code=start

import javax.swing.tree.TreeNode;

/**
 * 
 * 以下代码已在leetcode官网正常提交并通过
 * 
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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;

        TreeNode left = root.left;
        TreeNode right = root.right;

        int leftHeight = 0, rightHeight = 0, numOfNodes = 0;

        //后序遍历

        while(left != null ) {
            left = left.left; //left 的引用不再指向 current 的直接右子节点，而是指向了原左子节点的左子节点。
            leftHeight++; // 左子树高度
        }

        while(right != null ) {
            right = right.right; //right 的引用不再指向 current 的直接右子节点，而是指向了原右子节点的右子节点。
            rightHeight++; // 右子树高度
        }

        if(leftHeight == rightHeight) {
            numOfNodes = (2 << leftHeight) - 1;
            return numOfNodes;
        }

        return countNodes(root.left) + countNodes(root.right) + 1;
        //+1指的是最后加上根节点
        //这里不能直接写left and right，它们是local variables for the recursion call
        
    }
}
// @lc code=end

