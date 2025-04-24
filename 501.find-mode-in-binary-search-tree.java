/*
 * @lc app=leetcode id=501 lang=java
 *
 * [501] Find Mode in Binary Search Tree
 */

// @lc code=start

import java.util.ArrayList;

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
    private int maxCount = 0;

    private int count = 0;
    
    private List<Integer> list = new ArrayList<>();

    private Integer pre = null;

    public int[] findMode(TreeNode root) {
        dfs(root, list);

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node == null) return;

        dfs(node.left, list);

        if (pre != null && pre == node.val) { //注意先要check pre not null，理由见笔记
            count++;
        } else {
            count = 1;
        }

        if (count == maxCount) {
            list.add(node.val);
        } else if (count > maxCount) {
            list.clear();
            list.add(node.val);
            maxCount = count;
        }

        //处理中间，assign先
        pre = node.val;

        dfs(node.right, list);

    }

 }
// @lc code=end

