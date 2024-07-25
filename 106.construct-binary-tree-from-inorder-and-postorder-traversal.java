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

