/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
// 题目：Given alettering containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
// A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

// @lc code=start

class Solution {
 
    List<String> result = new ArrayList<>();
    public List<String> letterCombinations(String digits) {

       //edge case
       if(digits == null || digits.length() == 0) {
        return result;
       }

       //前两位0和1对应的都是空字符串
      String[] letterMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

       backtracking(digits,letterMap,0);
       return result;

    }

    
   StringBuilder temp = new StringBuilder();

    private void backtracking(String digits,String[] letterMap, int index) {
        //index指遍历到的“数字”下标

        if(index == digits.length()) {
            // index指遍历到第几个数字，同时也表示树的深度。index不能直接指向最后一个数字，因为最后一个数字也需要遍历，所以index指向digits.length()
            result.add(temp.toString());
            return;
        }

        int digit = digits.charAt(index)-'0';
        //从digits取单个的数字

        String letter = letterMap[digit];
        //从letterMap中取出对应的字符串

        for(int i=0; i<letter.length(); i++) {
            temp.append(letter.charAt(i));
            backtracking(digits,letterMap,index+1);
            //index一开始是0，所以指向digits中的2.第二次遍历时index+1，指向digits中的3。通过temp.append联接
            temp.deleteCharAt(temp.length()-1);

        }
    }


}

// @lc code=end

