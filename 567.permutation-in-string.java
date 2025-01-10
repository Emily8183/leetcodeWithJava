/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 * condition: String s1, String s2
   solution: 滑动窗口
 */

// @lc code=start


class Solution {
    public boolean checkInclusion(String s1, String s2) {

        //edge case
        if (s1.length() > s2.length()) return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;//把ab加入(leetcode sample 1)
            arr2[s2.charAt(i) - 'a']++;//把ei加入
        }

        for (int i = 0; i < s2.length()-s1.length(); i++) {
            if (matches(arr1, arr2)) return true;

           arr2[s2.charAt(i + s1.length()) - 'a']++;//把d加入
           arr2[s2.charAt(i) - 'a']--;//把e去掉
        }

        return matches(arr1,arr2);
    }
    

    private boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            
            if (arr1[i] != arr2[i]) return false;
            
        }

        return true;

    }

  
}
// @lc code=end

