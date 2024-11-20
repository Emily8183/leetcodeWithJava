/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 * 
 * solution: 
 * 1) int left = 3, int right = 3, ending point: while left == 0 && right == 0;
 * 2) Prune: if (left < right) return;
 */

// @lc code=start
class Solution {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        backtracking("", n, n);

        return res;
        
    }

    private void backtracking(String current, int left, int right) {
        //end point
        if (left == 0 && right == 0) {
            res.add(current);
            return;
        }

        if (left > right  || left < 0 || right < 0) return;

        backtracking(current + "(", left-1, right);
        backtracking(current + ")", left, right-1);
        
    }
}
// @lc code=end

