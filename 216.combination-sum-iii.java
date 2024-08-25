/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */
// 题目：Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.

// @lc code=start
class Solution {

    //注意全局变量的位置
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {

        backtracking(k, n, 0, 1);
        return result;

    }

    private void backtracking(int k, int n, int sum, int startIndex) {
        //第一次剪枝
        if(sum > n) {
            return;
        }
       
        if (path.size() == k) {
            if(sum == n) {
                result.add(new ArrayList<>(path));
                return;
            } 
        }

        //第二次剪枝

        for (int i= startIndex; i <= 9 -(k-path.size())+1; i++) {
            path.add(i);
            sum+=i;
            backtracking(k, n, sum, i+1);
            sum-=i;
            path.removeLast();
            // 为了保持代码的逻辑一致性和可读性，建议按照 "先恢复 sum 再恢复 path" 的顺序来编写代码。
            
        }
        
       

    }
}
// @lc code=end

