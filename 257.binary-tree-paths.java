/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
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
    
            /**
             * 递归法
             */
            public List<String> binaryTreePaths(TreeNode root) {
                List<String> res = new ArrayList<>();// 存最终的结果
                if (root == null) {
                    return res;
                }
                List<Integer> paths = new ArrayList<>();// 作为结果中的路径
                traversal(root, paths, res);
                return res;
            }
        
            private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
                paths.add(root.val);// 前序遍历，中
                // 遇到叶子结点
                if (root.left == null && root.right == null) {
                    // 输出
                    StringBuilder sb = new StringBuilder();// StringBuilder用来拼接字符串，速度更快

                    // 循环遍历 paths 列表，除了最后一个元素，添加到 sb 中并加上 "->"
                    for (int i = 0; i < paths.size() - 1; i++) {
                        sb.append(paths.get(i)).append("->");
                    }

                    // 添加最后一个节点，不加 "->"
                    sb.append(paths.get(paths.size() - 1));
                    res.add(sb.toString());// // 将拼接好的路径字符串添加到结果列表 res 中
                    return;
                }
                // 递归和回溯是同时进行，所以要放在同一个花括号里
                if (root.left != null) { // 左
                    traversal(root.left, paths, res);
                    paths.remove(paths.size() - 1);// 回溯
                }
                if (root.right != null) { // 右
                    traversal(root.right, paths, res);
                    paths.remove(paths.size() - 1);// 回溯
                }
            }
        }
        
  
// @lc code=end

