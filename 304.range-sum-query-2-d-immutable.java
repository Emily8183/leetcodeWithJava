/*
 * @lc app=leetcode id=304 lang=java
 *
 * [304] Range Sum Query 2D - Immutable
 * 用dp思路来解，先要求出大框的面积，减去2框，加上左上角重复减的框，得出结果
 */

// @lc code=start
class NumMatrix {


    int[][] dp;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return;
        
        int m = matrix.length; //长
        int n = matrix[0].length; //宽

        dp = new int[m+1][n+1]; //从而得出从0出发的距离

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                //求出dp大框的前缀和
                dp[i+1][j+1] = dp[i][j+1] + dp[i+1][j] + matrix[i][j] - dp[i][j];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2+1][col2+1] - dp[row2+1][col1] - dp[row1][col2+1] + dp[row1][col1];
        //dp[row2+1][1] 横框
        //dp[row1][col2+1] 纵框
        //dp[row1][col1] 重合部分
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
// @lc code=end

