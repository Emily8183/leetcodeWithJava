/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 * condition: String s (upperCase && lowerCase)
 * goal: longest palindrome
 * solution: HashSet
 * 
 * s = "abccccdd", int len = 1
 * element * 2 => len+2
 * only 1 single element => len+1
 * dccaccd
 */

// @lc code=start

class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (set.contains(c)) {
                count += 2;
                set.remove(c);
            } else {
                set.add(c);
            }

        }

        if (set.size() > 0) count = count+1; //说明剩下的都是个位数的元素，count只能加一次

        return count;

    }
}
// @lc code=end

