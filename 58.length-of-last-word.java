/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 * //String s ="word word"
 * //iterate the string (toCharArray) from the end, if its " ", pointer--
 * //int length => to count the length of the word, once we meet space, and meet a new word, count will be reset 
 * //two pointers
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {

        char[] arr = s.toCharArray();

        int count = 0;

        int fast = arr.length-1;

        while ( fast >= 0 && arr[fast] == ' ') {
                fast--;
        }

        while ( fast >= 0 && arr[fast] != ' ') {
            fast--;
            count++;
        } //这里不需要break

        return count;
        
    }
}
// @lc code=end

