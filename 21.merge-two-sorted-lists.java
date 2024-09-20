/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //corner case
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        //create a dummy node, value is -1. 用cur指向dummy node
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        //比较大小
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        } 

        cur.next = list1 != null? list1: list2;

        return dummy.next;


        
    }
}
// @lc code=end

