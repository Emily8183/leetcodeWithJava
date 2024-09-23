/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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

    //解法一：双指针Iterative, 时间是O(n)，空间是O(1)
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        return pre;
    }



    
    //解法二：递归,空间是O(n)
    // public ListNode reverseList(ListNode head) {
    //     return reverse (null,head);
    //     //注意这边的顺序，pre=null, cur=head; 
    // }

    // private ListNode reverse (ListNode pre, ListNode cur) {

    //     if (cur == null) {
    //         return pre;
    //     }

    //     ListNode temp = cur.next;
      
    //     cur.next = pre;
    //     return reverse(cur,temp);
    // }
        
    
}
// @lc code=end

