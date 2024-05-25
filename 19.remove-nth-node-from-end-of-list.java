/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode (0, head);

        ListNode fast = dummyHead;
        ListNode slow = dummyHead;

        // fast move n steps
        while(n-- > 0 && fast != null) {
            fast = fast.next;
        }

        // since we need to find one index ahead of the nth node,the fast pointer need to move one more step
        fast = fast.next;

        //now the fast and slow pointers can move together, 1,2,3 go!
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        //remove the nth node
        slow.next = slow.next.next;

        //return the head
        return dummyHead.next;
        
    }
}
// @lc code=end

