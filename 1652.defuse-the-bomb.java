/*
 * @lc app=leetcode id=1652 lang=java
 *
 * [1652] Defuse the Bomb
 */

// @lc code=start
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;

        int[] res = new int[n];

        if (k == 0) return res;

        int left = 0;

        int sum = 0;

        for (int right = 0; right <= n + Math.abs(k); right++) {
            sum += code[right % n];

            //窗口比k的绝对值大的时候，我们缩小left的边界
            if ((right - left + 1) > Math.abs(k)) {
                sum -= code [left % n];
                left = (left + 1) % n;
            }

            if (right - left + 1 == Math.abs(k)) {
                if (k > 0) {
                    res[((left-1) % n + n) % n] = sum; //当k > 0，给窗口left左侧的index赋值。如果left - 1是负数，在java中需要通过模运算把其映射到合法范围内
                } else if (k < 0) {
                    res[(right + 1) % n] = sum; //当k < 0，给窗口right边界右侧的index赋值
                }
            }
        }

        return res;
        
    }
}
// @lc code=end

