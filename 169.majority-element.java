/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        //题解1：滑动窗口
        Arrays.sort(nums);

        int count = 1;

        int maxCount = 1;

        int  majorityElement=nums[0];



        for(int i=1; i < nums.length; i++) {

                    if (nums[i]== nums[i-1]){
                        count++;
                    } else {
                        count = 1;
                    }

                    if(count>maxCount) {
                        maxCount = count;
                        majorityElement=nums[i];
                    }
        }

        return majorityElement;
    }
}

// @lc code=end

