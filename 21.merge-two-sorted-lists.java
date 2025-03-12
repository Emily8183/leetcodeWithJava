/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 * list1, list2 <= sorted
 * splicing together <= 不创建新的 ListNode，而是复用原来的节点。
 * two ptrs
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

        //edge cases
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode dummyHead = new ListNode(-1);

        ListNode cur = dummyHead;

        //can't set "ListNode cur = null", which means cur won't have a next pointer. 
        //therefore, cur.next will throw NullPointerException (NPE)。

        //while (cur.next != null) { <= wrong condition
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

        //check if there's leftover nodes in list1 or list2
        if (list1 != null) {
            cur.next = list1; //list1 或 list2 代表了 剩余的所有节点，所以不需要再手动 cur = cur.next;。
        } else if (list2 != null) {
            cur.next = list2;
        }

        return dummyHead.next; //return值不是cur
        
    }
}
// @lc code=end

