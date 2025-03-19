/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
 * no need to use dummyHead
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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode newEvenHead = evenHead;

        while (evenHead != null && evenHead.next != null) {
            oddHead.next = evenHead.next;
            oddHead = oddHead.next;

            evenHead.next = oddHead.next;
            evenHead = evenHead.next;
        }

        oddHead.next = newEvenHead; //返回的时候,要返回这个列表的头部.所以需要提前设一个newEvenHead

        return head;
        
    }
}
// @lc code=end

