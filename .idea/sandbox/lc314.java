//leetcode 314

package sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class lc314 {

        public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
    
        lc314 lc314 = new lc314();
        List<List<Integer>> result = lc314.verticalOrder(root);
        System.out.println(result);

        }

        // 方法1：
       // Map to store nodes by column index
        Map<Integer, ArrayList<int[]>> colMap = new HashMap<>();

        // Track minimum and maximum column indices
        int minCol = 0;
        int maxCol = 0;

        public List<List<Integer>> verticalOrder(TreeNode root) {
            List<List<Integer>> res = new ArrayList<>();

            if (root == null) return res;

            // Perform DFS to fill colMap
            dfs(root, 0, 0);

            // Retrieve the result by sorting columns and rows
            for (int i = minCol; i <= maxCol; i++) {
                // Sort nodes in the same column by row index
                Collections.sort(colMap.get(i), new Comparator<int[]>() {
                    @Override
                    public int compare(int[] a, int[] b) {
                        return Integer.compare(a[0], b[0]);
                    }
                });

                // Collect sorted column values
                List<Integer> sortedCol = new ArrayList<>();
                for (int[] pair : colMap.get(i)) {
                    sortedCol.add(pair[1]);
                }
                res.add(sortedCol);
            }

            return res;
        }

        private void dfs(TreeNode node, int row, int col) {
            if (node == null) return;

            // Add node value and its row index to the corresponding column
            colMap.putIfAbsent(col, new ArrayList<>());
            colMap.get(col).add(new int[]{row, node.val}); //key - col, value - (row, val);

            // Update minCol and maxCol
            minCol = Math.min(minCol, col);
            maxCol = Math.max(maxCol, col);

            // Recursive DFS for left and right children
            dfs(node.left, row + 1, col - 1);
            dfs(node.right, row + 1, col + 1);
        }
}





        // 方法2（贾考博视频）：
        // private int min = 0;
        // private int max = 0;

        // private void helper(TreeNode root, int index) {
        //     if (root == null) return;
        //     min = Math.min(min, index); 
        //     max = Math.max(max, index); 
        //     helper(root.left, index - 1);  // 遍历左子树
        //     helper(root.right, index + 1); // 遍历右子树
        // }

        // public List<List<Integer>> verticalOrder(TreeNode root) {
        //     List<List<Integer>> res = new ArrayList<>(); //[]

        //     if (root == null) return res;

        //     helper(root, 0);

        //     //创建框架
        //     for (int i = min; i <= max; i++) {
        //         System.out.println(i);
        //         res.add(new ArrayList<>()); //[[],[],[],[]]
        //     }

        //     //[   [],    [],   [],    []   ] 
        //     //   res[0],res[1],res[2],res[3]

        //     Queue<TreeNode> queue = new LinkedList<>(); //Node
        //     Queue<Integer> index = new LinkedList<>(); //index

        //     queue.offer(root);
        //     index.offer(-min);

        //     while(!queue.isEmpty()){
        //         TreeNode curr = queue.poll();
        //         int currIndex = index.poll();

        //         res.get(currIndex).add(curr.val);

        //         if (curr.left != null){
        //             queue.offer(curr.left);
        //             index.offer(currIndex-1);
        //         }

        //         if (curr.right != null){
        //             queue.offer(curr.right);
        //             index.offer(currIndex+1);
        //         }

        //     }

        // return res;

        // }


