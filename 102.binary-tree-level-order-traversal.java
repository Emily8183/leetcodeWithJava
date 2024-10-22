/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
 */

// @lc code=start

import java.util.Deque;

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
 */
class Solution {

    public List<List<Integer>> resList = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        queueResult(root);
        return resList;
    }

    public void queueResult(TreeNode node) {

       //early return
       if (node == null) return;

       //创建一个队列，把root放进队列
       Queue<TreeNode> que = new LinkedList<TreeNode>();
       que.offer(node);

       //while loop，当队列不为空
       while (!que.isEmpty()) {
        //记录队列的size, 此时size = 1;
        int len = que.size();

        //创建一个List，存取每一层的元素，最后这个List要加到resList
        List<Integer> list = new ArrayList<Integer>();

        while (len > 0) {
            TreeNode tempNode = que.poll();
            list.add(tempNode.val);

            //只要队列的size>1，就陆续不断把元素拿出队列，root有左右两个孩子，加入队列，更新size = 2
            if (tempNode.left != null) {
                que.offer(tempNode.left);
            } 
            
            //注意这里不是else if关系
            if (tempNode.right != null) {
                que.offer(tempNode.right);
            }

            len--;
        } 

        resList.add(list);

       }

       


    }
}
// @lc code=end

