/*
 * @lc app=leetcode id=445 lang=java
 *
 * [445] Add Two Numbers II
 * 1) 还有一个倒装的做法: cur.next = head;https://www.youtube.com/watch?v=Vck4VTUaTwA
 * 2) 普通做法: reverse
 * */

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode l1Rev = reverse(l1);
      ListNode l2Rev = reverse(l2);

      ListNode dummy = new ListNode(-1);
      ListNode cur = dummy;

      int carry = 0;

      while (l1Rev != null || l2Rev != null) {
        int num1 = l1Rev == null ? 0 : l1Rev.val;
        int num2 = l2Rev == null ? 0 : l2Rev.val;

        int sum = num1 + num2 + carry;

        carry = sum / 10;

        int remain = sum % 10;

        cur.next = new ListNode(remain);

        cur = cur.next;

        if (l1Rev != null) l1Rev = l1Rev.next;
        if (l2Rev != null) l2Rev = l2Rev.next;

      }

      if (carry != 0) {
        cur.next = new ListNode(carry);
      }

      return reverse(dummy.next);
        
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
// @lc code=end

