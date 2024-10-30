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
 *  Solution:

 1. 题目要求的输出是 每条路径作为一个字符串。所以我们需要将路径转换成 String 格式，比如 "1->2->3"，将这些字符串存入 List<String>，而不是嵌套列表 List<List<Integer>>。
 2. 这道题需要回溯到分叉的节点，这样才可以向另一边遍历
 3. 前序遍历
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
                List<Integer> paths = new ArrayList<>();// 每单条路径都对应一个列表，存到 paths 中，再将paths 从array转为string，存到 res 中

                traversal(root, paths, res);
                return res;
            }
        
            private void traversal(TreeNode root, List<Integer> paths, List<String> res) {
                paths.add(root.val);// 前序遍历，中
                // 遇到叶子结点时，就可以把单条路径加到结果列表res中，return
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
                // 递归和回溯是同时进行，所以要放在同一个花括号里。在递归调用返回后，从 paths 列表中移除当前节点的值，以恢复到调用该递归函数之前的状态
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

