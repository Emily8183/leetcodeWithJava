/*
 * @lc app=leetcode id=18 lang=java
 *
 * [18] 4Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    //     List<List<Integer>> res = new ArrayList<>();

    //     Arrays.sort(nums);

    //     //在循环i的基础上，循环j

    //     for(int i=0;i<nums.length;i++) {
    //         if(nums[i]>=0 && nums[i] > target) {
    //             break; //对nums[i]进行剪枝
    //         }

    //         if(i>0 && nums[i] == nums[i-1]) {
    //             continue; //对nums[i]去重
    //         }

    //         for (int j=i+1; j<nums.length; j++) {
    //             if (nums[j]>0 && nums[j]+nums[i] >target) {
    //                 break; //对nums[j]进行剪枝
    //             }

    //             if(j>i+1 && nums[j] == nums[j-1]) {
    //                 continue; //对nums[j]去重
    //             }

    //             int left = j+1;
    //             int right = nums.length-1;

    //             while (left<right) {
    //                 int sum = nums[i] + nums[j] + nums[left] + nums[right];

    //                 if (sum == target) {
    //                     res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

    //                     while (left<right && nums[left] == nums[left+1]) left++;

    //                     while (left<right && nums[right] == nums[right-1]) right--;
 
    //                     left++;
    //                     right--;
    //                     //循环检查其他数组
                    
    //                 } else if (sum<target) {
    //                     left++;
    //                 } else {right--;}
    //             }
    //         }


    //     }
    // return res;
    List<List<Integer>> res = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {

        //当nums[i]是正数，且大于target，不需要继续向后遍历
        if (nums[i] >= 0 && nums[i] > target) break;

        //去重, 避免重新处理同样的i元素
        if (i > 0 && nums[i-1] == nums[i]) continue;

        for (int j = i+1; j < nums.length; j++) {

            //当nums[i]+nums[j]是正数，且大于target，不需要继续向后遍历
             if (nums[i]+nums[j] >= 0 && nums[i]+nums[j] > target) break;

            //对j进行去重
            if (j > i+1 && nums[j-1] == nums[j]) continue;

            //双指针
            int left = j+1;
            int right = nums.length-1;

            while (left < right) {
                int sum = nums[i]+nums[j]+nums[left]+nums[right];

                if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                     res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left+1]) left++;//left去重
                    while (right > left && nums[right-1] == nums[right]) right--; //right去重

                     left++;
                     right--;
                }
            }
        }
    }
    return res;

    }
}
// @lc code=end

