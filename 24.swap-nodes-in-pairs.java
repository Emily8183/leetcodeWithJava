/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0,head);
        ListNode cur=dummyHead;

        //while loop when not reaching the end of the list for the even case and the odd case (pay attention to the order!)
        while(cur.next !=null && cur.next.next != null){

        // store two nodes in temp and temp1 before breaking the link
            ListNode temp = cur.next;
            ListNode newCur = temp.next;
            ListNode temp1 = cur.next.next.next;

            //swap
            cur.next=newCur;
            newCur.next=temp;
            temp.next=temp1;

            //move cur to the new spot
            cur=cur.next.next;

        }

        return dummyHead.next;

        
    }
}
// @lc code=end

