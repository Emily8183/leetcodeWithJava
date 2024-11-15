/*
 * @lc app=leetcode id=654 lang=java
 *
 * [654] Maximum Binary Tree
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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recursive(nums,0,nums.length);
    }

    public TreeNode recursive(int[]nums, int leftIndex, int rightIndex) {
        // 递归终止条件 base case
        if (leftIndex >= rightIndex) {//遍历到数组区间为0
            return null;
        }

        if(nums.length == 1) {//遍历到数组区间为1
            return new TreeNode(nums[leftIndex]);
        }

        // 找到数组中最大的值和对应的下标，保持左闭右开原则
        int maxValueIndex = leftIndex; //最大值所在位置
        int maxValue = nums[maxValueIndex]; //最大值
        for (int i = leftIndex; i < rightIndex; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
                maxValueIndex = i;
            }
        }

        TreeNode root = new TreeNode(maxValue);
       
        // 最大值所在的下标左区间 构造左子树,允许空节点进入递归
        root.left = recursive(nums, leftIndex, maxValueIndex);
        // 最大值所在的下标右区间 构造右子树
        root.right = recursive(nums, maxValueIndex+1, rightIndex);

        return root;
        
        }
    }

// @lc code=end

