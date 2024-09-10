/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 * 
 三个变量，遍历i，然后调节left和right的位置，分析出现的两种情况：>0 和 <0；
 这题的关键在于去重，a\b\c分别进行去重。去重的原理在于这三个数字有自己的轨迹，如果在自己的轨迹上有重复，则去重（复习视频会更好理解）
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); //每个三元组是一个 List<Integer>，而所有的三元组构成的集合是 List<List<Integer>>。
        
        Arrays.sort(nums); // must sort first to use Two Pointers

        for (int i=0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]) { //对a进行去重。之所以不用i+1而是用i-1，因为i不能和left比，应该和已经遍历过的i相比
                continue;
            }

            int left = i+1;
            int right = nums.length-1;

            while (left < right) { //如果包含等号，left和right指向同一个index，不满足题目要求，所以不能包含
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right])); //使用Arrays.asList将array转为List，然后使用List接口的功能

                    while (left < right && nums[left] == nums[left+1]) left++; //给b去重

                    while (left< right && nums[right] == nums[right-1]) right--; //给c去重

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                } 
            }
        }
        return res;
    }
    
}
// @lc code=end

