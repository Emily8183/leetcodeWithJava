/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Non-decreasing Subsequences
 */
// 题目：Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements. You may return the answer in any order.


// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return result;
    }

    private void backtracking(int[] nums, int startIndex) {
        if(path.size()>=2) {
            result.add(new ArrayList<>(path));
  
        }

        HashSet <Integer> used = new HashSet<>();

        for(int i = startIndex; i<nums.length; i++) {
            if(!path.isEmpty() && nums[i]< path.getLast() || used.contains(nums[i])) continue;

            used.add(nums[i]);
            path.add(nums[i]);
            backtracking(nums, i+1);
            path.removeLast();


        }



    }
}
// @lc code=end

