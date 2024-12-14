/*
 * @lc app=leetcode id=2351 lang=java
 *
String s, lowercase
goal: to find the first letter appears twice
solution: 
1) two pointers(doesn't work if the two nums arent adjacent)
2) array, ascii


a     b     c    c     baacz
          f


 * [2351] First Letter to Appear Twice
 */

// @lc code=start


class Solution {
    public char repeatedCharacter(String s) {
        int[] arr = new int[26];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - 'a';

            arr[digit]++;

            if (arr[digit] == 2) {
                index = i;
                break;
            }
        }

        return s.charAt(index); 
        
    }
}
// @lc code=end

