/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //boyer-moore, must be less than 3 numbers
        int num1 = 0;
        int count1 = 0;

        int num2 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1) count1++;
            else if (nums[i] == num2) count2++;
            else if (count1 == 0) {
                num1 = nums[i];
                count1 = 1; //《== 这一步不要忘
            }  else if (count2 == 0) {
                num2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();

        if (count1 > nums.length/3) result.add(num1);
        if (count2 > nums.length/3) result.add(num2);

        return result;


        
    }
}
// @lc code=end

