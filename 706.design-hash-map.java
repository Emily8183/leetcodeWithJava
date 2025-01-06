/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 * 
 */

// @lc code=start

class ListNode {
    int key;
    int val;
    ListNode next;

    ListNode(int key, int val) {
        this.key = key;
        this.val = val;
        this.next = next;
    }
}

class MyHashMap {

    private ListNode[] bucket;

    public MyHashMap() {
        bucket = new ListNode[10000];
  
    }
    
    public void put(int key, int value) {
        int hash = hash(key);

        if (bucket[hash] == null) { //Checks whether the bucket at index hash is empty.
            bucket[hash] = new ListNode(-1, -1);
        }

        ListNode prev = find(bucket[hash], key);
        if (prev.next == null) { //Checks whether the key being added already exists in the linked list at the current bucket.
            prev.next = new ListNode(key, value); //则增加一组ListNode
        } else {
            prev.next.val = value;
        }
    }
    
    public int get(int key) {
        int hash = hash(key);

        if (bucket[hash] == null) {
            return -1;
        }

        ListNode prev = find(bucket[hash],key);

        return prev.next == null? -1 : prev.next.val; 

        
    }
    
    public void remove(int key) {
        int hash = hash(key);

        if (bucket[hash] == null) {
            return;
        }

        ListNode prev = find(bucket[hash],key);

        if (prev.next == null) {
            return;
        } 

        prev.next = prev.next.next;

        
    }

    //这个function找的是prev，不是cur
    private ListNode find(ListNode bucket, int key) {
        ListNode cur = bucket;
        ListNode prev = null; //prev就是dummyHead

        while (cur != null && cur.key != key) {
            prev = cur;
            cur = cur.next;
        }

        return prev;
    }

    private int hash(int key) {
        return Integer.hashCode(key) % bucket.length; 
        //In Java, the hashCode() of an integer is the integer itself, so this is equivalent to just key.
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

