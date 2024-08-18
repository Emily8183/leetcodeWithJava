/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start

class Solution {
 
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

       //edge case
       if(digits == null || digits.length() == 0) {
        return result;
       }

       //前两位0和1对应的都是空字符串
       String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

       backtracking(digits,numString,0);
       return result;

    }

    //StringBuilder的运用
    StringBuilder temp = new StringBuilder();

    private void backtracking(String digits, String[] numString, int index) {
        //index指遍历到的“数字”下标

        if(index == digits.length()) {
            result.add(temp.toString());
            return;
        }

        String str = numString[digits.charAt(index)-'0'];

        for(int i=0; i<str.length(); i++) {
            temp.append(str.charAt(i));
            backtracking(digits,numString,index+1);
            temp.deleteCharAt(temp.length()-1);

        }
    }


}

// @lc code=end

