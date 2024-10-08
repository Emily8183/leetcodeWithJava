/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */
// 题目：Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

// @lc code=start


class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        backtracking(nums,0);
        return result;
        
    }

    private void backtracking(int[] nums, int startIndex){
        result.add(new ArrayList<>(path));

        if(startIndex >= nums.length) return; //终止条件可以省略，直接走下面的for loop, for loop中就有元素选择的范围，在for loop下加一个return就可以

        for(int i = startIndex; i<nums.length; i++) {
            path.add(nums[i]);
            backtracking(nums, i+1);
            path.removeLast();
        
        }

    }
}
// @lc code=end

