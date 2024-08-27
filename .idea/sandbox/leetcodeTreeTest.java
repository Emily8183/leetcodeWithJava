package sandbox;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class leetcodeTreeTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = null;
        root.right.right = new TreeNode(9);
        System.out.println(root.val);
    
        leetcodeTreeTest leetcodeTreeTest = new leetcodeTreeTest();
        List<Integer> result = leetcodeTreeTest.largestValues(root);
        System.out.println(result);
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null) return new ArrayList<>();  
        //在输入为空树的情况下，安全且合理地返回一个空的结果。如返回Null，调用该方法的代码在访问返回结果时，可能会抛出 NullPointerException

        queue.offer(root);//先要把root放进queue内

        while(!queue.isEmpty()) {
            int size = queue.size(); 
            //这里需要给queue.size()做一个快照，因为后面会不断pop，所以size会变
            //size在while loop里是局部变量，但是对for loop来说是全局变量
            //这里用maxValue来记录当前这一层的最大值
            int maxValue = Integer.MIN_VALUE;

            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                maxValue = Math.max(maxValue, node.val);

                if(node.left != null) {queue.offer(node.left);}

                if(node.right !=null) {queue.offer(node.right);}

            }

            result.add(maxValue);
        }
        return result;
    }

}
