/*
 * @lc app=leetcode id=2490 lang=java
 *
 * [2490] Circular Sentence
 */

// @lc code=start
class Solution {
    public boolean isCircularSentence(String sentence) {
        char[] ch = sentence.toCharArray();

        int n = ch.length;

        if (ch[0] != ch[n-1]) return false;

        for (int i = 0; i < n; i++) {
            if (ch[i] == ' ') {
                if (ch[i-1] != ch[i+1]) return false;
            }
        }

        return true;  
    }
}
// @lc code=end

