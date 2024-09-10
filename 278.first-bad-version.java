/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {

    //左闭右闭, 二分查找

    public int firstBadVersion(int n) {

        int start = 0;
        int end = n-1; //length是n，index是n-1
        int mid = n/2;

        //应该用while的时候不要用if
        //设定左闭右闭区间，所以这里有等号
        while (start <= end) { //这里是遍历的终止条件
            mid = start + (end-start)/2;

            if(!isBadVersion(mid)) {
            start = mid + 1;
            } else {
            end = mid - 1;
            }

        }

        return start; //edge case: 当只有一个元素的时候，start = mid +1，返回的false index是1，因此也是成立的
    }

}
// @lc code=end

