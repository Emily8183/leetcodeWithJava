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

//  class Solution {
//     public ListNode swapPairs(ListNode head) {
//         ListNode dummyHead = new ListNode(0, head);
//         ListNode cur = dummyHead;

//         // While loop when not reaching the end of the list
//         while (cur.next != null && cur.next.next != null) {
//             ListNode first = cur.next;
//             ListNode second = cur.next.next;
//             ListNode nextPair = cur.next.next.next;

//             // Swap
//             cur.next = second;
//             second.next = first;
//             first.next = nextPair;

//             // Move cur to the next pair
//             cur = first;
//         }

//         return dummyHead.next;
//     }
// }


class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0,head);
        ListNode cur=dummyHead;

        //while loop when not reaching the end of the list for the odd case and the even case
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

