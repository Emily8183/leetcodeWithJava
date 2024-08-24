/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */
// 题目：Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        Arrays.fill(used,false);
        Arrays.sort(nums);
        backtracking(nums, used);
        return result;
    }

    private void backtracking(int[] nums, boolean[] used){
        if(path.size()== nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0; i <nums.length; i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            
            if(!used[i]){

            used[i]= true;
            path.add(nums[i]);
            backtracking(nums, used);
            used[i] = false;
            path.removeLast();
            }


        }

  
    }
}
// @lc code=end

