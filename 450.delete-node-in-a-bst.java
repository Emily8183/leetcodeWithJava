/*
 * @lc app=leetcode id=450 lang=java
 *
 * [450] Delete Node in a BST
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
    public TreeNode deleteNode(TreeNode root, int key) {
      
        // 设置递归的终点，也是删除叶子的逻辑过程。一共5种情况
        //1）当没有找到节点，return null；
        if(root == null) return null;

        if(root.val==key) {

            if(root.left == null && root.right == null){
                return null; // 2）当找到的节点为叶子节点，直接删除即可
            } else if(root.right != null && root.left==null) {
            return root.right; //3) 左不为空，右为空
            } else if(root.left != null && root.right ==null) {
            return root.left;
            } else { // 4) 左右都不为空
            TreeNode cur = root.right;
            while(cur.left != null) {
                cur = cur.left; //只要cur.left不为空，cur就一直指向cur.left
            }
            cur.left = root.left; //将原本位置的左子树，嫁接到新的root的左侧，从而仍然保持是BST
            return root.right;
            }
        }

        //设置单层逻辑
        if(key < root.val) root.left=deleteNode(root.left, key);
        if(key > root.val) root.right=deleteNode(root.right, key);

        return root;

        
    }
}
// @lc code=end

