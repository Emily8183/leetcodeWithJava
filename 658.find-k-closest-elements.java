/*
 * @lc app=leetcode id=658 lang=java
 *
 * [658] Find K Closest Elements
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> list = new ArrayList<>();

        if(arr.length == k) {
            for (int i = 0; i < k; i++) {
                list.add(arr[i]);
            }
            return list;
        }

        int left = 0;
        int right = arr.length;
                
        while (left < right) {

            int mid = left + (right - left) /2;

            if (arr[mid] >= x) {
                right = mid;   
            } else if (arr[mid] < x) {
                left = mid + 1;
            } 
        }

        left -= 1;
        right = left + 1;

       while (right - left - 1 < k) {
        if (left < 0) {
            right++;
        } else if (right >= arr.length || Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
            left--;
        } else {
            right++;
        }
       }

        for (int i = left+1; i < right; i++) { //左开右开
            list.add(arr[i]);
        }

        return list;
    

    }
}
// @lc code=end

