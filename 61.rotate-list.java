/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {

        //边界
        if (head == null || head.next == null || k == 0) return head;

        //计算出list的长度
        int length = 1; //因为到这里，至少有一个节点
        ListNode tail = head; 
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        //不需要与k比较，因为如果k< length, 以下也成立
        // if (length > k) {
            k = k % length;
        // }head

        if (k == 0) return head;

        //新的tail就是length-k-1个节点
        int newTailIndex = length - k - 1;
        ListNode newTail = head;//newTail从头部开始传

        for (int i = 0; i < newTailIndex; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        //把旧尾巴指向头节点，形成闭环
        tail.next = head; //原来的尾巴指向头节点，形成闭环；

        //在新尾巴处断开
         newTail.next = null;

         return newHead;
        
    }
}
// @lc code=end

