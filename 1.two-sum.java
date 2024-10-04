/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];

            if(map.containsKey(temp)){
            result[0]= i;
            result[1]=map.get(temp);
            }

        map.put(nums[i],i);

        }

        return result;
    }
    // public int[] twoSum(int[] nums, int target) {
    //     int[] res= new int[2];

    //     Map<Integer, Integer> map = new HashMap<>();

    //     for (int i=0;i<nums.length;i++) {
    //         int temp = target - nums[i]; // 遍历当前元素，并在map中寻找是否有匹配的key
    //         //例如target=9,数组是[2,7,11,15]，nums[i]=2,temp=7
    //         //map中无key为7的元素，则map.containsKey(temp)为false，则将nums[i]和下标i加入map中

    //         if (map.containsKey(temp)) {
    //             res[1] = i;
    //             res[0] = map.get(temp);
    //             //获取temp的下标1
                
    //             break;
    //         }
    //         map.put(nums[i],i); // 如果没找到匹配对，就把访问过的元素和下标加入到map中
    //     }
    //     return res;
        
    // }
}
// @lc code=end

