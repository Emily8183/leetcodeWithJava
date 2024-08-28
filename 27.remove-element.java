/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 * 
 *Steps:

 1. Use Two Pointers to remove the element in the array;
 2. Use the first pointer(the fast pointer) to find the element which is not equal to val;
 3. Use the second pointer(the slow pointer) to assign the value of the first pointer to the new index;
 4. Return the index of the second pointer, which is the length of the updated array;
 

Tips:
1.The elements of an array are stored at consecutive memory addresses, so you can't delete a single element in an array, you can only overwrite it.
2.By using a fast pointer and a slow pointer in a single for loop, you can achieve the work of two for loops. The fast pointer collects the elements that need to be added to the new array, while the slow pointer is assigned the new element values.
3. .erase() (if you use C++) is an O(n) operation.
 */

// @lc code=start
class Solution {
        public int removeElement(int[] nums, int val) {
            int slow = 0;

            for(int i=0; i < nums.length; i++) {
                //i可以用fast代替,看起来更清楚

                if(nums[i] != val) {

                nums[slow] = nums[i];
                slow++;

                }

            }

            return slow;


        }
}
// @lc code=end

