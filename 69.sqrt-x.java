/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 * 二分查找，理解middle和right的关系
 */

// @lc code=start
class Solution {
    public int mySqrt(int x) {

        // 特殊情况处理
        if (x == 0 || x == 1) return x;  // 0的平方根是0，1的平方根是1

        int left = 0;
        // int right = Integer.MAX_VALUE; 错误的right
        int right = x;
        int result = 0;
        
        while (left <= right) { //right=x，说明是一个左闭右闭区间，因此这里应该是left<=right
            int middle = left + (right-left)/2;

            if (middle > x / middle) {
                right = middle - 1;
            } else if ( middle < x / middle) {
                left = middle + 1;
                result = middle;
            } else {
                return middle;
            }
        }

        return result;
    }
}
// @lc code=end

