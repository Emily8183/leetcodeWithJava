/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start

// design a node first
class ListNode {
    int key;
    ListNode next;

    //constructure
    ListNode(int key) {
        this.key = key;
        this.next = null;
    }
}

class MyHashSet {

    private ListNode[] set;

    public MyHashSet() {
        set = new ListNode[10000];   
    }
    
    public void add(int key) {
        int index = key % set.length;

        if (set[index] == null) {
            set[index] = new ListNode(key);//if the list is empty, add the key directly
            return;
        }

        ListNode cur = set[index];
        while (cur.next != null) {
            if (cur.key == key) return; //if found the same number, just return 
            cur = cur.next; //if didn't find the number, move cur to the end of the list
        } 
        
        if (cur.key != key) {
            cur.next = new ListNode(key); //add the new node to the end of the list
        }
    }
    
    public void remove(int key) {
        int index = key % set.length;

        ListNode cur = set[index];

        if (cur == null) return;

        if (cur.key == key) {
            set[index] = cur.next; //if cur.next == null, set[index] will be null
            return;
        }

        while (cur.next != null) {
            if (cur.next.key == key) {
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
            
    }
    
    public boolean contains(int key) {
        int index = key % set.length;
        ListNode cur = set[index];

        while (cur != null) {
            if (cur.key == key) return true;
            cur = cur.next;
        }

        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

