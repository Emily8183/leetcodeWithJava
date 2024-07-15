/*
 * @lc app=leetcode id=106 lang=java
 *
 * [106] Construct Binary Tree from Inorder and Postorder Traversal
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> inorderList = new ArrayList<>();
        List<Integer> postorderList = new ArrayList<>();

        for(int val:inorder) inorderList.add(val); //通过for-each loop，把题目给到的数组中的每一个元素，添加到List中，这样可以使用 List 的 subList 方法，避免数组的频繁复制
        for(int val:postorder) postorderList.add(val);
        return traversal(inorderList, postorderList);
    }

    private TreeNode traversal(List<Integer> inorder, List<Integer> postorder) {
        if(postorder.size() == 0) return null;
    

        int rootValue = postorder.get(postorder.size()-1); //后序遍历最后一个数值就是根节点的值

        TreeNode root = new TreeNode(rootValue); //定义根节点

        if (postorder.size() == 1) return root; //如果只有一个节点，即当根节点也是叶子节点，直接返回

        int middleIndex;//中序遍历根节点的位置
        for (middleIndex = 0; middleIndex < inorder.size(); middleIndex++) {
            if (inorder.get(middleIndex) == rootValue) break; //在中序遍历中遍历，找到根节点的位置
        }

        List<Integer> leftInorder = new ArrayList<>(inorder.subList(0, middleIndex)); //用左闭右开的方式，在中序遍历中切割出左子树
        List<Integer> rightInorder = new ArrayList<>(inorder.subList(middleIndex + 1, inorder.size())); //用左闭右开的方式，在中序遍历中切割出右子树

        postorder.remove(postorder.size() - 1); //这样在下一次递归调用中，postorder 列表的最后一个元素就是当前子树的根节点。

        List<Integer> leftPostorder = new ArrayList<>(postorder.subList(0, leftInorder.size())); //用左闭右开的方式，在后序遍历中切割出左子树
        List<Integer> rightPostorder = new ArrayList<>(postorder.subList(leftInorder.size(), postorder.size())); //用左闭右开的方式，在后序遍历中切割出右子树

        root.left = traversal(leftInorder, leftPostorder); //遍历左中序和左后序
        root.right = traversal(rightInorder, rightPostorder); //遍历右中序和右后序

        return root;
    }
    
}
// @lc code=end

