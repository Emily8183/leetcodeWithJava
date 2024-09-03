/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

import java.util.Map;

class Solution {
    public int majorityElement(int[] nums) {

        //题解1：双指针法。
        // 排序最耗时，时间复杂度是O(n log n)，其中 n 是数组的长度。双指针中遍历数组的时间复杂度是 O(n)，其中 n 是数组的长度。因为每个元素都只被访问一次。综合来看，整个算法的时间复杂度为 O(n log n)。
        // 由于排序是原地进行的，并且只使用了常数级别的额外空间。所以空间复杂度是O(1)
        
        // Arrays.sort(nums);

        // int count = 1;

        // int maxCount = 1;

        // int  majorityElement=nums[0];



        // for(int i=1; i < nums.length; i++) {

        //     if (nums[i]== nums[i-1]){
        //         count++;
        //     } else {
        //         count = 1;
        //     }

        //     if(count>maxCount) {
        //         maxCount = count;
        //         majorityElement=nums[i];
        //     }
        // }

        // return majorityElement;

        //题解2：HashMap, 时间复杂度是 O(n)，因为我们只需要遍历数组一次，而空间复杂度也是 O(n)，用于存储 HashMap 中的元素。
        // Map<Integer,Integer> map = new HashMap<>();

        // int count =0;

        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num, 0)+1); 
        //     //在map中增添key-value pair，如果key已经存在于map, 增加其计数；如果之前不存在于map，设定初始值为0，记一数则为1；
        
        //     if(map.get(num) > nums.length/2){
        //         return num;
        //     }
        
        // }

        // return -1; //理论上，这个题目假设输入一定有多数元素，所以这里不会执行到


        //解法3：投票法
        //从第一个元素开始从零计算次数，出现第二个不同数字时，逐步递减次数直至归零，再正向计算。最终剩下的数则为众数
        int count =0;
        Integer candidate = null;

        for(int num: nums) {
            if(count == 0) {
                candidate = num;
            }

            count += (num==candidate) ? 1: -1;
        }

        return candidate;
    
    }
    
}

// @lc code=end

