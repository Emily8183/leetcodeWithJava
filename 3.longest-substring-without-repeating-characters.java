/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();

        Set<Character> hashset = new HashSet<>();

        int maxLength = 0;

        //sliding window
        int left = 0;

        for (int right = 0; right < arr.length; right++) {

            while (hashset.contains(arr[right])) {        
                hashset.remove(arr[left]);
                left++;
              
            }

            hashset.add(arr[right]);

            maxLength = Math.max(maxLength,right-left+1);

        }

        return maxLength;
        
    }
}
// @lc code=end

