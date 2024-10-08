/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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

    //快慢针优化，只需要遍历一次
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while ( fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } 

        return slow;  
    }
}
// @lc code=end

