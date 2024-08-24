/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */
// 题目：Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
//这道题中没有重复出现的数字，因此不需要去重

// @lc code=start
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        used = new boolean[nums.length];
        backtracking(nums);
        return result;
    }

    private void backtracking(int[] nums) {
        if(path.size()==nums.length){
            result.add(new ArrayList<>(path));
        }

        for(int i=0; i < nums.length; i++){
            //和组合最大的区别在于i从0开始取，不需要startIndex
            if(used[i]) continue;
     
          used[i]=true;
          path.add(nums[i]);
          backtracking(nums);
          used[i] = false;
          path.removeLast();
        //   最后两行的先后顺序无所谓
       


        }
    }
}
// @lc code=end

