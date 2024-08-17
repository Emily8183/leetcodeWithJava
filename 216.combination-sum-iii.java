/*
 * @lc app=leetcode id=216 lang=java
 *
 * [216] Combination Sum III
 */

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

        for (int i= startIndex; i <= 9 -(path.size()-k+1); i++) {
            path.add(i);
            sum+=i;
            backtracking(k, n, sum, i+1);
            path.removeLast();
            sum-=i;
        }
       

    }
}
// @lc code=end

