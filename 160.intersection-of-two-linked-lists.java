/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 * 
 * Steps: 
 * 1） 遍历A一直到null，然后开始遍历b
 * 2) 遍历B一直到null，然后开始遍历A
 * 3) 如果a和b相等，则停止遍历，返回A或者B. 这个就是intersection node
 * 4） 如果没有交点，A遍历B一直到终点
 * 
 */

 

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null) {
                a = headB;
            } else a = a.next;

            if (b == null) {
                b = headA;
            } else b = b.next;
            // a = (a == null) ? headB : a.next;
            // b = (b == null) ? headA : b.next;
        }

        return a;
        // 此时 a 和 b 要么都指向交点，retun任意一个。要么都为 null，return null
        
    }
}
// @lc code=end

