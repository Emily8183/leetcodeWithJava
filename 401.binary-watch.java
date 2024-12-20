/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start

// 思路：回溯，使用数组存储LED数，回溯函数中使用两个int存储小时和分钟
// 时间复杂度：O（2^n）*/

class Solution {
    List<String> result = new ArrayList<>();
    public List<String> readBinaryWatch(int num) {
        
        //判断输入
        // if(num < 0) return result;

        //LED灯，前四个为小时，后六个为分钟
        int[] nums = {8,4,2,1,32,16,8,4,2,1};

        backtracking(num,nums,0,0,0);
        return result;
    }
    public void backtracking(int num,int[] nums,int start,int hour,int minute){

        //如果亮灯数 num == 0，说明所有灯已经分配完，判断时间是否有效：
        if(num == 0){

            //判断时间是否正确
            if(hour > 11||minute > 59) return;

            StringBuilder tmp = new StringBuilder();

            //小时
            tmp.append(hour);
            tmp.append(":");

            //分钟
            if(minute < 10) {
                tmp.append(0);
            }
            
            tmp.append(minute);
            result.add(new String(tmp));

            return;
        }

        for(int i = start; i < nums.length; i++){

            /*回溯做选择*/
            //判断是小时还是分钟
            if(i < 4) {//小时
                hour += nums[i];
            } else {
                minute += nums[i];
            }
            //递归
            backtracking(num-1, nums, i+1, hour, minute);
            /*回溯取消选择*/
            if(i<4) {//小时
                hour -= nums[i];
            } else {
                minute -= nums[i];
            }
        }
    }
}
// @lc code=end

