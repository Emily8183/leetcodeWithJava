/*
 * @lc app=leetcode id=513 lang=java
 *
 * [513] Find Bottom Left Tree Value
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
            //递归(隐藏回溯过程版):
            // private int maxDepth = -1;
            // private int result = 0;
            // public int findBottomLeftValue(TreeNode root) {
            //     result = root.val;
            //     findLeftValue(root,0);
            //     return result;
            // }
        
            // private void findLeftValue (TreeNode root,int currentDepth) {
            //     if (root == null) return;
            //     if (root.left == null && root.right == null) {
            //         if (currentDepth > maxDepth) {
            //             result = root.val;
            //             maxDepth = currentDepth;
            //         }
            //     }

            //     // 如果有左孩子，递归调用左孩子，并且深度加1
            //     if (root.left != null) findLeftValue(root.left,currentDepth + 1); 
            //     //这里一直在currentDepth + 1，不影响原来currentDepth的值。因此这段代码已经隐藏了回溯的过程
                
                
            //     // 如果有右孩子，递归调用左孩子，并且深度加1
            //     if (root.right != null) findLeftValue(root.right,currentDepth + 1);
            // }

            //迭代法:
            public int findBottomLeftValue(TreeNode root) {
            if (root == null) return 0;

            Queue<TreeNode> que = new LinkedList<>();
    
            que.offer(root);
    
            int mostLeftNodeVal = 0;
    
            while (!que.isEmpty()) {
    
                int len = que.size();
    
                for (int i = 0; i < len; i++) {
    
                    TreeNode temp = que.poll();
    
                    if (i == 0) {
                        mostLeftNodeVal = temp.val; 
                    } //每一层第一个poll出来的节点，就是最左节点
                        
                
                    if (temp.left != null) que.offer(temp.left);
                    if (temp.right != null) que.offer(temp.right);
    
                }
            }
    
            return mostLeftNodeVal;
            }


        }
    
// @lc code=end

