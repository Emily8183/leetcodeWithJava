/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
 * two ptrs
 * this problem doesnt have to set dummyHead becuz the first number will always be kept
 * 1) how to remove a node, cur.next = cur.next.next
 * 2) while loop condition 
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

        ListNode cur = head;

        while (cur != null && cur.next != null) {

            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }  
        }

        return head;
 
        
    }
}
// @lc code=end

