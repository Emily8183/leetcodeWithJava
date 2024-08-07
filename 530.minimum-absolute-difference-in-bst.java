/*
 * @lc app=leetcode id=530 lang=java
 *
 * [530] Minimum Absolute Difference in BST
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

    //设定全局变量
    TreeNode pre;
    // TreeNode cur;

    //将result先设为最大值
    int result = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

        if(root == null) return 0;

        traversal(root);

        return result;
    }

    public void traversal(TreeNode cur){

        //因为没有返回值，因此当root == null时，直接终止运行；
        if(cur == null) return;

        //左中右，中序遍历
        traversal(cur.left);

        if(pre!=null) {
            result = Math.min(result, cur.val-pre.val);
        }

        pre = cur;

        traversal(cur.right);
    }  
}

// @lc code=end

