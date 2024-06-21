/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next !=null){

            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode index1 = head;
                ListNode index2 = fast;
                //here can also write index2 = slow, since fast and slow have the same value when they meet, so either is fine

                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }

        return null;
        
    }
}
// @lc code=end

