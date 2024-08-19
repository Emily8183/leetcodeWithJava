/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates); //给candidates排序
        backtracking(candidates, target, 0,0);
        return result;
        
    }

    //注意这道题用的是start，不是startIndex（因为题目允许重复，所以遍历时不需要往后移一位）
    private void backtracking(int[] candidates, int target, int sum, int start){
        if(sum > target) return;//剪枝
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i<candidates.length; i++) {
            // if(sum+candidates[i]>target) break;

            sum+= candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i);
            sum-=candidates[i];
            path.removeLast();
            
             
        }


    }
}
// @lc code=end
