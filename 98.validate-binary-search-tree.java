/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
 */

// @lc code=start

import java.util.Stack;

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

    //迭代法
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new stack<>();

        TreeNode pre = null;

        if (root != null) stack.offer(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.peak();


        }
        


    

        
        
    }

    
}

//递归(中序遍历)：使用pre虚拟节点遍历
    private TreeNode pre = null;
    public boolean isValidBST(TreeNode root) {

        if(root == null) return true;

        boolean left = isValidBST(root.left);

        // 这两行必须在boolean left下面，因为必须先在左子树遍历完毕（左边永远比右边小）
         if(pre !=null && pre.val >= root.val) return false;

         pre = root;

         boolean right = isValidBST(root.right);

         return left && right;
}

//前序遍历
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
//     }

//     private boolean isValidBST(TreeNode node, long left, long right) {
//         if (node == null) {
//             return true;
//         }
//         long x = node.val;
//         return left < x && x < right &&
//                isValidBST(node.left, left, x) &&
//                isValidBST(node.right, x, right);
//     }
// }

//后序遍历：
// class Solution {
//     public boolean isValidBST(TreeNode root) {
//         // 调用 dfs 函数来检查树是否是 BST
//         // 返回的数组中的第二个值不等于 Long.MAX_VALUE 表示树是一个有效的 BST
//         return dfs(root)[1] != Long.MAX_VALUE;
//     }

//     private long[] dfs(TreeNode node) {
//         // 如果当前节点为空，返回一个数组，表示这是一个空子树
//         // 空子树的最小值设为 Long.MAX_VALUE，最大值设为 Long.MIN_VALUE
//         if (node == null) {
//             return new long[]{Long.MAX_VALUE, Long.MIN_VALUE};
//         }

//         // 递归调用左子树和右子树，获取左子树和右子树的最小值和最大值
//         long[] left = dfs(node.left);
//         long[] right = dfs(node.right);
//         long x = node.val;

//         // 检查当前节点值是否符合 BST 性质
//         // 当前节点的值应该大于左子树的最大值，且小于右子树的最小值
//         if (x <= left[1] || x >= right[0]) {
//             // 如果不符合，返回一个特殊的值，表示这个树不是 BST
//             return new long[]{Long.MIN_VALUE, Long.MAX_VALUE};
//         }

//         // 返回当前子树的最小值和最大值
//         // 当前子树的最小值为左子树的最小值与当前节点值中的较小者
//         // 当前子树的最大值为右子树的最大值与当前节点值中的较大者
//         return new long[]{Math.min(left[0], x), Math.max(right[1], x)};
//     }
// }
// @lc code=end

