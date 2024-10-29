/*
 * @lc app=leetcode id=572 lang=java
 *
 * [572] Subtree of Another Tree
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        //Solution 1: using queue and recursion
        // Queue<TreeNode> que = new LinkedList<>();

        // que.offer(root);

        // while (!que.isEmpty()) {
        //     int len = que.size();

        //     while (len > 0) {

        //         TreeNode temp = que.poll();
                
        //         if (temp.val == subRoot.val) {
        //             if (compareTwoTrees(temp,subRoot)) return true;
        //         }

        //         if(temp.left != null) que.offer(temp.left);
        //         if(temp.right != null) que.offer(temp.right);

        //         len--;
        //     }
        // }

        // return false;

        //solution 2: use recursion to call compareTwoTrees
        if (subRoot == null) return true;

        if (root == null) return false;

        if (compareTwoTrees(root, subRoot)) return true;

        boolean checkLeftSide = isSubtree(root.left, subRoot);
        boolean checkRightSide = isSubtree(root.right, subRoot);

        return checkLeftSide || checkRightSide;
        
    }

    private boolean compareTwoTrees(TreeNode p, TreeNode q) {
        if ( p == null && q == null) return true;

        if ( p == null || q == null || p.val != q.val) return false;

        boolean compareLeft = compareTwoTrees(p.left, q.left);
        boolean compareRight = compareTwoTrees(p.right, q.right);

        return compareLeft && compareRight;
    }
}

// @lc code=end

