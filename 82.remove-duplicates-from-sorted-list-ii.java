/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) {
    
        ListNode dummyHead = new ListNode(0,head);
        ListNode cur = dummyHead;

        if (head == null) {
            return head;
        }

        while ( cur.next != null && cur.next.next != null) {
            if (cur.next.next.val == cur.next.val) {
                int duplicatedValue = cur.next.next.val;
            
                while (cur.next != null && cur.next.val == duplicatedValue) {
                    cur.next = cur.next.next;
                }
            } else cur = cur.next;
        }

        return dummyHead.next;
        
    }
}
// @lc code=end

