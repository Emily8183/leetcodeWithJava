/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */
// Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
// The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
// frequency of at least one of the chosen numbers is different.
// The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0,0);
        return result; 
    }

    private void backtracking(int[] candidates, int target, int sum, int startIndex) {
        if(sum > target) return;//剪枝
        if(sum == target){
            result.add(new ArrayList<>(path));
            
        }

        for(int i = startIndex; i<candidates.length; i++) {
            // if(sum+candidates[i]>target) break;

            path.add(candidates[i]);
            sum+= candidates[i];
            backtracking(candidates, target, sum, i);
            //新取一个数是需要取下一个数，例如[2,5,3]，取2、5、3。但是取了2以后，下一层仍然可以取2（可以重复），因此这里是i，而不需要i+1
            sum-=candidates[i];
            path.removeLast();   
        }
    }
}
// @lc code=end

