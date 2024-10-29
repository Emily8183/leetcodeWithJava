/*
 * @lc app=leetcode id=508 lang=java
 *
 * [508] Most Frequent Subtree Sum
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

    int max = 0;

    Map<Integer, Integer> map = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {

        if (root == null) return new int[0];

        calculateSum(root);

        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                list.add(key);
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }

        return res;
        
    }

    private int calculateSum(TreeNode node) {

        if (node == null) return 0;

        int leftSum = calculateSum(node.left);
        int rightSum = calculateSum(node.right);

        int sum = node.val + leftSum + rightSum;

        map.put(sum, map.getOrDefault(sum, 0)+1);

        max = Math.max(max, map.get(sum));

        return sum;
    }
}
// @lc code=end

