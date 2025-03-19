/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 * key: x = z
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
        ListNode slow = head, fast = head;

        while ( fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode index1 = head;
                ListNode index2 = fast;

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

