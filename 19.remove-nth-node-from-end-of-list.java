/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 * //two ptrs
 * //dummyNode
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
        //solution1: two passes
        //can also solve the problem with two traverses
        
        //solution2: one pass
        //need a dummyNode for the edge case when the head needs to be removed
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        // ListNode dummyHead = new ListNode (0, head);

        ListNode slow = dummyHead;
        ListNode fast = dummyHead;

        //  [1, 2, 3,4,5]
        //        fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next; 
        }

        //      [1,  2,   3,  4,   5]
        //               slow         fast
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummyHead.next;
        
    }
}
// @lc code=end

