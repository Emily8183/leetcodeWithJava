/*
 * @lc app=leetcode id=2266 lang=java
 *
 * [2266] Count Number of Texts
 * 动态规划
 * 
 * //如何通过数字找到对应的字母: store all the key-value pairs into an array 
  {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
 * //数字的分割问题:
 * 1)for (int i = startIndex; i < pressedKeys.length(), i++) 
 * 用string str来分割数字, 每分割出一小段拼接到path中;
 * 2) 每两个数字之间必须要分割: s[i] != s[i-1], 必须分割;
3) 一直到i 到s.length那就是分割完毕,count++;
return count


 */

// @lc code=start
class Solution {

    int num = 0;
    public int countTexts(String pressedKeys) {

        String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        backtracking();

        return num;
        
    }

    private void backtracking(String s, String[] keys, int startIndex) {
        if (startIndex == s.length()-1) {
            num++;
            return;
        }
        
        

        int digit = pressedKeys.charAt(index) - '0';

        String letter = keys[digit];

        for (int i = startIndex; i < s.length(); i++) {
           String str = s.substring(startIndex, i + 1);
        //    path.add(str);
        backtracking()


        }
}
// @lc code=end

