/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 * condition: int[] versions;
 * goal: find the first bad version
 * solution: binary search [t,t,t,t,t,t,f,f,f,f,f,f]
 * left = true, mid = false; 
 * 
 * [product 1, product 2, product3...]
 * index = 0, 1, 2
 * 
 * while (left < right) 
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) { //left inclusive, right inclusive

            int mid = left + (right-left)/2; 

            if (!isBadVersion(mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;

    }

}
// @lc code=end

