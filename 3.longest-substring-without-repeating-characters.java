/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {


        //解法一: 把string转到array
        // char[] arr = s.toCharArray();

        // Set<Character> hashset = new HashSet<>();

        // int maxLength = 0;

        // //sliding window
        // int left = 0;

        // for (int right = 0; right < arr.length; right++) {

        //     while (hashset.contains(arr[right])) {        
        //         hashset.remove(arr[left]);
        //         left++;
              
        //     }

        //     hashset.add(arr[right]);

        //     maxLength = Math.max(maxLength,right-left+1);

        // }

        //解法二:优化, 直接用s.CharAt()来指向left and right, 不需要新创建array

        Set<Character> hashset = new HashSet<>();

        int maxLength = 0;

        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (hashset.contains(s.charAt(right))) { //charAt, c是小写
                hashset.remove(s.charAt(left));
                left++;
            }

            hashset.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
        
    }
}
// @lc code=end

