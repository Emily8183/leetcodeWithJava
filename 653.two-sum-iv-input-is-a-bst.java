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


    //第二种方法，用于bst
    TreeNode root;
    public boolean findTarget(TreeNode root, int k) {

        if (this.root == null) this.root = root; //确保 this.root 只在第一次赋值,保留整棵树的原始根节点 (root)

        if (root == null) return false;

        if (search(root, k-root.val)) return true;

        return findTarget(root.left, k) || findTarget(root.right, k);

    }

    public boolean search(TreeNode root, int target) {
        TreeNode current = this.root; //使用 this.root 保证从根节点开始搜索

        while (current != null) {
            if (target > current.val) {
            current = current.right;
            } else if (target < current.val) {
            current = current.left;
            } else { 
                return current != root;
            }
    }

    return false;

    }

}
// @lc code=end

