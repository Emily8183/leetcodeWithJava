/*
 * @lc app=leetcode id=160 lang=java
 *
 * [160] Intersection of Two Linked Lists
 * 
 * 底层逻辑：两个链表一起遍历，如果有相交，那总节点一样。a、b能够相遇
 * 比如：listA = [4,1,8,4,5], listB = [5,6,1,8,4,5]
 * 
 * 1） 遍历A一直到null，然后开始遍历b, 到8是第9步
 * 2) 遍历B一直到null，然后开始遍历A，到8也是第9步
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

       ListNode a = headA;
       ListNode b = headB;

       while (a != b) {

            if (a != null) {
                a = a.next;
            } else {
                a = headB;
            }

            if (b != null) {
                b = b.next;
            } else {
                b = headA;
            }
       }

       return a;
    }
}
// @lc code=end

