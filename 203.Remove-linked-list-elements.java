/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
 * 
 * Steps:
 * 1.  iterate in a loop to look for the node with the value "Node.val == val"
 * 2. set up a dummy head node to avoid the situation that the head node is the node to be deleted.
 * 3. 要删一个node，就是要知道这个node的上一个node，所以上一个node是current，删的是current.next
 
 /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// @lc code=start


class Solution {
    public ListNode removeElements(ListNode head, int val) {

    if(head == null) {
        return head;
    }

    ListNode dummyHead = new ListNode(0, head);//The actual value (0) doesn't matter much because it's not part of the list's logical data
    ListNode cur = dummyHead; //不能直接用头节点遍历，因为头节点所指向的值不可以改变

    while (cur.next != null) {
        if (cur.next.val == val) {
            cur.next = cur.next.next;
        } else {
            cur = cur.next;
            //如果没有找到val，继续遍历
        }
    }
    
    return dummyHead.next;
}
}

// @lc code=end