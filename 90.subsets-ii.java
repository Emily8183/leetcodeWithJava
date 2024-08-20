/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtracking(nums,0);
        return result;
        
    }

    private void backtracking(int[] nums, int startIndex){
        result.add(new ArrayList<>(path));
        //path为空集时也可以添加进result

        if(startIndex >= nums.length) return; //终止条件可以省略，直接走下面的for loop, for loop中就有元素选择的范围，在for loop下加一个return就可以

        for(int i = startIndex; i<nums.length; i++) {
            if(i>startIndex && nums[i]==nums[i-1] && used[i]==false) continue;
            path.add(nums[i]);
            backtracking(nums, i+1);
            path.removeLast();
        }

    }
}
// @lc code=end

