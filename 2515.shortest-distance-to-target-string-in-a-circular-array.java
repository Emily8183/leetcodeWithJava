/*
 * @lc app=leetcode id=2515 lang=java
 *
 * [2515] Shortest Distance to Target String in a Circular Array
 */

// @lc code=start
class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {

       int len = words.length;

       int minDistance = Integer.MAX_VALUE;

       for (int i = 0; i < len; i++) {

        if (words[i].equals(target)) {
            int distance = Math.abs(i - startIndex);
            minDistance = Math.min(distance, minDistance); //这是向右
            minDistance = Math.min(minDistance, len - distance); //这是向左
        }

       }

    return minDistance == Integer.MAX_VALUE? -1 : minDistance;
        
    }
}
// @lc code=end

