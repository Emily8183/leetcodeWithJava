/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        

        if(root == null){
            return null;
        }

        //初始化一个队列，把第一层根节点加入
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        //prev虚拟头节点，用于遍历队列
        Node prev = null;

        while(!queue.isEmpty()){

            //保存当前层的节点数量
            int size = queue.size();

            while(size-- > 0){
                Node cur = queue.poll();
                if(cur.left != null) queue.add(cur.left);
                if(cur.right != null) queue.add(cur.right);
                
          
                //利用这两行来更新prev的指针，指向下一个节点，并且不断更新prev
                if(prev != null) prev.next = cur;
                prev = cur;
            }
            //当size <= 0的时候需要重置prev。
            prev = null;
        }

        return root;
        
    }
}


        

// @lc code=end

