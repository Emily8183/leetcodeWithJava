/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();

        //在2k这一段反转，限制条件是2k没有超过arr.length
        for(int i=0; i<arr.length; i+=2*k) {
            if(i+k <= arr.length) {
            reverse(arr,i,i+k-1);
            } else{
           //如果剩余字符少于k，把剩下的也反转
           reverse(arr,i,arr.length-1);
            }
        }
        return new String(arr);
    }

    private void reverse(char[] arr, int start, int end){
        while (start >= end) {
            return;
        }

        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start+1, end-1);
    }
}
// @lc code=end

