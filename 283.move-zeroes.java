/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;//j指向非零数字的index

        //双指针, 不需要嵌套两个循环, j++
        for(int i=0;i<nums.length;i++){
            // for(int j=0;j<nums.length;j++){
                if(nums[i]!=0) {
                    nums[j++]=nums[i];

                } 
        }

        for(int i= j;i<nums.length; i++){
            nums[i]=0;
        }
    }
}

// 打印数组结果不能直接用System.out.println(nums),打印的是数组对象的引用，返回类似 [I@1b6d3586 这样的哈希值。
// 为了正确打印数组的内容，需要遍历数组并打印每个元素，或者使用 Arrays.toString(nums) 来将数组转换为字符串表示，再打印出来。
    // public static void main(String[] args) {
    // leetcodeTest leetcodeTest = new leetcodeTest();
    // int[] nums = {0,1,0,3,12}; 
   
    // leetcodeTest.moveZeroes(nums);

    // for(int num:nums) {
    //     System.out.println(num);
    // }

    //OR:  System.out.println(Arrays.toString(nums)); 

// }

// @lc code=end

