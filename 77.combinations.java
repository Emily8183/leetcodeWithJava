/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    //设定两个全局变量
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;        
    }

    public void backtracking(int n, int k, int startIndex) {
        if(path.size()==k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=startIndex; i <= n-(k-path.size())+1; i++) {
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }

    }
}
// @lc code=end

