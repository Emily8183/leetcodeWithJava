/*
 * @lc app=leetcode id=912 lang=java
 *
 * [912] Sort an Array
 */

// @lc code=start
//int[] nums
//goal: sort in ascending order, smallest space
//solution:
//1, mergesort; 2, heapsort; 3, quicksort
//mergesort: 将数组递归拆分，分别排序后再合并 (divide & conquer分治思想)

class Solution {
    public int[] sortArray(int[] nums) {

        recursion(nums, 0, nums.length-1);
        return nums;
         
    }

    private void recursion(int[] nums, int l, int r) {
        //base
        if (l == r) return;

        int m = l + (r - l) / 2; //需要避免溢出

        recursion(nums, l, m);
        recursion(nums, m+1, r);
        merge(nums, l, m, r);
    }

    private void merge(int[] nums, int L, int M, int R) {
        int[] temp = new int[R-L+1];

        int i = L;
        int j = M + 1;
        int k = 0;

       while ( i <= M && j <= R) {
        if (nums[i] <= nums[j]) {
            temp[k++] = nums[i++];
        } else {
            temp[k++] = nums[j++];
        }
       }

       while ( i <= M ) {
        temp[k++] = nums[i++];
       } 

       while ( j <= R) {
        temp[k++] = nums[j++];
       }

       for (int p = 0; p < temp.length; p++) {
        nums[L+p] = temp[p];
       }

      
    }
}
// @lc code=end

