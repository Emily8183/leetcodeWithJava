/*
 * @lc app=leetcode id=107 lang=java
 *
 * [107] Binary Tree Level Order Traversal II
 */

// @lc code=start

import java.util.Queue;

import javax.swing.tree.TreeNode;

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
 * 两个方法，1）新创建一个finalList，把所有的元素从后往前重新添加一遍，实现翻转；2）每次添加元素的时候，直接使用method .addFirst()，替换.add
 */
class Solution {
    List<List<Integer>> finalList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        //call helper function
        traverse(root);

        //return result
        return finalList;
        
    }

    public void traverse(TreeNode node) {
        //set up a new <List<List<Integer>> tempList
        List<List<Integer>> tempList = new ArrayList<List<Integer>>();

        if (node == null) return;
        //set up a queue
        //add node to the queue
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.offer(node);

        //while: queue is not empty
        while (!que.isEmpty()) {

        //in the loop, set up a new list to add all the node.val in the queue
        List<Integer> list = new ArrayList<Integer>();
        
        //snap of the length of the queue
        int len = que.size();

        //add the list to resList
            while(len > 0) {
                TreeNode tempNode = que.poll();
                list.add(tempNode.val);

                if (tempNode.left != null) que.add(tempNode.left);
                if (tempNode.right != null) que.add(tempNode.right);

                len--;
            }

        tempList.add(list);

        }

        //add again from back to front
        for (int i = tempList.size()-1; i >= 0; i--) {
            finalList.add(tempList.get(i));
        }


    }
        
}
// @lc code=end

