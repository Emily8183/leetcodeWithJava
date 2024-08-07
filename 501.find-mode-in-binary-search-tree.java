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
    ArrayList<Integer> resList;
    int maxCount;
    int count;
    TreeNode pre;
    public int[] findMode(TreeNode root) {
        //设置全局变量
        resList = new ArrayList<>();
        maxCount = 0;
        count = 0;
        pre = null;
        updateMaxCount(root);
        int[] res = new int[resList.size()];
        for(int i=0;i<resList.size();i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

        //递归函数,使用中序遍历
        public void updateMaxCount (TreeNode root){
            if(root == null) {
                return;
                //因为return void, 这边直接return 退出即可；
            }
            //左
            updateMaxCount(root.left);

            int rootValue = root.val;

            //中
            if(pre == null || rootValue != pre.val) {
                count = 1;
            } else {
                count++;
            }

            //判断count是否大于maxCount，如果比maxCount大，赋值给maxCount。同时需要清空resList

            if(count > maxCount) {
                resList.clear();
                resList.add(rootValue);
                maxCount = count;
            } else if(count == maxCount) {
                resList.add(rootValue);
            }

            pre=root;

            //右
            updateMaxCount(root.right);

        }

}
// @lc code=end

