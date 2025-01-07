/*
 * @lc app=leetcode id=424 lang=java
 *
 * [424] Longest Repeating Character Replacement
 */

// @lc code=start
class Solution {
    public int characterReplacement(String s, int k) {
        if (s == null || s.length() == 0) return 0;

        int[] arr = new int[26];

        int max_freq = 0, max_length = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            int numOfLetters = s.charAt(right) - 'A';
            arr[numOfLetters]++;
            max_freq = Math.max(max_freq, arr[numOfLetters]);

            while (right - left + 1 - max_freq > k) {
                arr[s.charAt(left) - 'A']--;
                left++; //需要替换的字母个数超过k，移动左边界
            }

            max_length = Math.max(max_length, right - left + 1);


        }

        return max_length;

        
    }
}
// @lc code=end

