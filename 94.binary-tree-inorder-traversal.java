/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */

// @lc code=start

import java.util.Stack;

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
    // public List<Integer> inorderTraversal(TreeNode root) {

    //     List<Integer> result = new ArrayList<>();
    //     inorder (root,result);
    //     return result;
    //     //ArrayList和LinkedList都是 List 接口的实现，可以互换使用，主要区别在于底层数据结构和性能特性。
    //     //ArrayList 底层是一个动态数组，随机访问性能较好（O(1)），但在插入或删除元素时需要移动数组中的其他元素，性能较差（O(n)）。
    //     //LinkedList 底层是一个双向链表，插入和删除元素性能较好（O(1)），但随机访问性能较差（O(n)）。
    // }

    // public void inorder(TreeNode root, List<Integer> list) {
    //     if (root == null) {
    //         return;
    //     }

    //     inorder(root.left, list);
    //     list.add(root.val);
    //     inorder(root.right, list);

    //中序遍历就是要用cur来遍历二叉树，判断右孩子是否为空，不为空时则弹出
    // }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>(); //注意是treeNode

        if (root == null) return result;

        TreeNode cur = root;

        while ( cur != null || !stack.isEmpty()) {
            if ( cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                result.add(cur.val);
                cur = cur.right;
            }

        }

        return result;
    }

}

// @lc code=end

