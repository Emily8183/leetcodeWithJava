/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 * 1) 遍历numbers 1中的数字，建立hash array1。只要出现过的数字，下标都标为1.
 * 2）遍历numbers 2。查询在numbers 1是否出现过，即数值是否==1（进行过下标）
 * 3）如果有的话，对应值insert到result。且这个result已经自然去重。*/

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2){
        if(nums1==null || nums2==null || nums1.length==0 || nums2.length==0) return new int[0];

        Set<Integer> hashSet1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();

        // 将 nums1 中的所有元素添加到 hashSet1 中
        for(int i:nums1) {
            hashSet1.add(i);
        }
        
        for(int i:nums2) {
            if(hashSet1.contains(i)){
              resultSet.add(i);
            }
        }

        int[] resultArr = new int[resultSet.size()];

        int i =0;
        for (int num:resultSet) {
            resultArr[i++] = num;
        }

        return resultArr;
    }

    //使用哈希数组的解法：
    // public int[] intersection(int[] nums1, int[] nums2) {
    //     //1 <= nums1.length, nums2.length <= 1000. We can use hash array for this question

    //     int[] hash = new int[1001];
 
    //     //在哈希数组中记录nums1中出现的数字
    //     for (int num: nums1) {
    //         hash[num]=1;
    //     }

    //     //使用一个临时列表来存储对比结果
    //     List<Integer> result = new ArrayList<>();

    //     for(int num:nums2){
    //         if(hash[num]==1){
    //             result.add(num);
    //             hash[num]=0; //手动把已经添加过的元素设置为0，以避免重复添加
    //         }
    //     }

    //     //return把ArrayList转换成数组[]
    //     int[] res = new int[result.size()];
    
    //     // for(int i = 0; i < result.size(); i++) {
    //     //     res[i] = result.get(i);
    //     // }

    //     //如果希望使用for-each loop，需要加一个索引
    //     int index = 0;
    //     for (int num:result) {
    //        res[index++] = num;
    //     }

    //     return res;
        
    // }
}
// @lc code=end

