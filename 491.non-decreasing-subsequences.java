/*
 * @lc app=leetcode id=491 lang=java
 *
 * [491] Non-decreasing Subsequences
 */
// 题目：Given an integer array nums, return all the different possible non-decreasing subsequences of the given array with at least two elements. You may return the answer in any order.


// @lc code=start

// class Solution {

//     List<List<Integer>> res = new ArrayList<>();
//     LinkedList<Integer> path = new LinkedList<>();

//     public List<List<Integer>> findSubsequences(int[] nums) {

//         backtracking(nums, 0);

//         return res;     
//     }

//     private void backtracking(int[] nums, int startIndex) {
//         if (path.size() >= 2 ) {
//             res.add(new ArrayList<>(path));
//         }

//         HashSet<Integer> used = new HashSet<>();

//         for (int i = startIndex; i < nums.length; i++) {
//             if (!path.isEmpty() && nums[i] < path.getLast() || used.contains(nums[i])) continue;

//             used.add(nums[i]);// 记录这个元素在本层用过了，本层后面不能再用了
//             path.add(nums[i]);
//             backtracking(nums, i+1);
//             path.removeLast();
//         }
//     }
// }

class Solution {

    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums, 0);

        return res;     
    }

    private void backtracking(int[] nums, int startIndex) {

        boolean[] used = new boolean[201];

        if (path.size() >= 2 ) {
            res.add(new ArrayList<>(path));
        }

        for (int i = startIndex; i < nums.length; i++) {
            if (!path.isEmpty() && nums[i] < path.getLast()) continue;
            if(used[nums[i] + 100]) continue; //nums[i] + 100 是为了将数字范围 [-100, 100] 映射到 [0, 200]。

            path.add(nums[i]);
            used[nums[i]+100] = true;
            backtracking(nums, i+1);
            path.removeLast();
        }
    }
 }
// @lc code=end

