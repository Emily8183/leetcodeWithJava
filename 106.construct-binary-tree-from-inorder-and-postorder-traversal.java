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

        if (postorder.length == 0 || inorder.length == 0) return null;

        return buildHelper(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode buildHelper(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postorderStart, int postorderEnd) {
        if (inorderStart >= inorderEnd || postorderStart >= postorderEnd) return null; // 因为是左闭右开区间，所以加入==，代表 there's no element to process

        int rootVal = postorder[postorderEnd - 1]; //左闭右开区间

        TreeNode root = new TreeNode(rootVal);

        int middleIndex = 0;

        for (middleIndex = inorderStart; middleIndex < inorderEnd; middleIndex++) {
            if (inorder[middleIndex] == root.val) break;
        }

        int leftInorderStart = inorderStart;
        int leftInorderEnd = middleIndex;
        int rightInorderStart = middleIndex + 1;
        int rightInorderEnd = inorderEnd;

        int leftTreeSize = middleIndex - leftInorderStart;

        int leftPostOrderStart = postorderStart;
        int leftPostOrderEnd = postorderStart + leftTreeSize;
        int rightPostOrderStart = leftPostOrderEnd;
        int rightPostOrderEnd = postorderEnd-1;

        root.left = buildHelper(inorder, leftInorderStart, leftInorderEnd, postorder, leftPostOrderStart, leftPostOrderEnd);
        root.right = buildHelper(inorder, rightInorderStart, rightInorderEnd, postorder, rightPostOrderStart, rightPostOrderEnd);

        return root;

    }

}

// class Solution {
//     //通过inorder和postorder 确认位置
//     //构造二叉树
//     HashMap<Integer,Integer> memo = new HashMap<>();
//     int[] post;

//     public TreeNode buildTree(int[] inorder, int[] postorder) {
//         //遍历中序遍历。
//         //memo容器存储 keyvalue pair 例如 {key: 4 , value: 0}
//         // key是对应的inorder的值，value为inorder对应的值的index
//         for(int i = 0;i < inorder.length; i++) memo.put(inorder[i], i);
//         //为什么只拷贝后序遍历？
//         //因为post在class里声明了全局变量。如果我们不考呗postorder就需要将postorder作为参数传入method
//         post = postorder;
//         //中序遍历 is 起始  ie 结束位置
//         //后续遍历的 ps其实位置， pe结束的位置
//         TreeNode root = buildTree(0, inorder.length - 1, 0, post.length - 1);
//         return root;
//     }

//     public TreeNode buildTree(int is, int ie, int ps, int pe) {
//         if(ie < is || pe < ps) return null;
//         //ps 和 pe是干嘛的？是通过post的区间的最后一位找到跟节点。
//         //is 和 ie 是干嘛的？ 是通过跟节点的index找到左右子树的分界线。
//         //root = 通过postorder结尾的index获得根结点 
//         //ri = 通过memo容器里拿到root这个根结点在inorder里对应的index
//         int root = post[pe];
//         int ri = memo.get(root);

//         //创建节点
//         TreeNode node = new TreeNode(root);
//         //接上node的左节点和右节点
//         node.left = buildTree(is, ri - 1, ps, ps + (ri - is) - 1);
//         node.right = buildTree(ri + 1, ie, ps + (ri - is), pe - 1);
//         return node;
//     }
// }
// @lc code=end

