/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */

// @lc code=start
class Solution {
    public int hIndex(int[] citations) {
      

      Arrays.sort(citations);

      for (int i = 0; i < citations.length; i++) {
        int h = citations.length-i;
        if (citations[i] >= citations.length-i) { //这一行不需要正好等于citations.length-i，比这个数大就可以
            return h;
        } 
      }

      return 0;
        
    }
}
// @lc code=end

