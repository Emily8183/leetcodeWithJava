/*
 * @lc app=leetcode id=707 lang=java
 *
 * [707] Design Linked List
 * Steps:
 * 1) Get: 
 * index = n, n starts from head
 * a) check index, if invalid, return -1;
 * b) you will need to keep moving the cur to cur.next until you find the index.
 * 
 * 2) AddAtHead: you would want to set the new node behind the dummyHead and let the newNod point to the previous dummyHead.next. Pay attention to the order!
 * Once you added the newNode, the connection between dummyHead to dummyHead.next is broken.
 * The correct oder is to set the newNode.next to dummyHead.next, and then set dummyHead.next to the newNode.
 * 
 * 3) AddAtTail: you will need to find the last node and add the new node behind it. How to find the tail? "while (cur.next == null), right?
 * 
 * 4) AddAtIndex:
 * a) Boundary thinking: 
 * index <= o, addAtHead;
 * index == size, addAtTail;
 * index > size, return;
 * b) Iterate to find the index, same way as Get. 
 * c) Same as the concept of AddAtHead, pay attention to the order.
 * d) size++
 * 
 * 5) DeleteAtIndex:
 * a) Boundary thinking: 
 * index < o || index >= size, return;
 * index == 0, head = head.next;
 * b) We will need to find cur, so that we can delete cur.next by using cur.next = cur.next.next.
 * c) How to find cur? Same way as Get.
 * d) Don't forget size--;
 * 
 * Tips：
 * 
 * Maintain the same format, dummyHead
 * */

// @lc code=start

//set up a ListNode class
class ListNode {
    int val;
    ListNode next;
    ListNode (){};
    ListNode (int val){
        this.val = val;
    }
    ListNode (int val, ListNode next){
        this.val = val;
        this.next = next;       
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    ListNode dummyHead;

    public MyLinkedList() {
        size = 0;
        dummyHead = new ListNode(0);
        head = null;
        dummyHead.next= head;
      
       
    }
    
    public int get(int index) {
  
        if(index < 0 || index >=size) {
            return -1;
        }

        // ListNode dummyHead = new ListNode(0, head);

        ListNode cur = dummyHead.next;

        //can set ListNode cur = head;

        while (index -- > 0) {
            cur = cur.next;
        }

        return cur.val;
    }  
    public void addAtHead(int val) {

        ListNode newNode = new ListNode(val);

        newNode.next = dummyHead.next;
        dummyHead.next = newNode;
        //这里也可以用到head，但是用这个做法更可靠

        size++;
        
    }
    
    public void addAtTail(int val) {
        ListNode newTail = new ListNode(val);
        ListNode cur = dummyHead;

        if(head == null) {
            head = newTail;
        } else {

            //loop until found the tail
            while (cur.next != null) {
                cur = cur.next;
            }
    
        cur.next = newTail;
        }
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;  // Simply exit the method since its java. Can't return null when the function set to void
        }

        if (index <= 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        ListNode cur = dummyHead;

        while (index-- > 0) {
            cur = cur.next;
        }

        ListNode newNode = new ListNode(val);
        newNode.next=cur.next;
        cur.next = newNode;

        size++;
        
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {return;}

        if(index == 0) {
            head = head.next;
        } else {

        ListNode cur = dummyHead;
 
        while (index-- > 0) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        }
        size--;
        
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
// @lc code=end

