/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 * 
 * Steps:
 * 
 * 1) Initialize variables: n, nums[i][j], startX, startY, offset, count; 
 // offset: Variable to adjust the end boundary of the current layer

 * 2) Fill the top row from left to right. Fill the most right column from top to bottom, etc. 
 * 3) Handle the center element when it's an odd number;
 * 
 * Tips:
 * 1) The number of layers to fill in the matrix: loop <= n/2
 * 2) 2-dimensional array, nums[i][j]
 * 3) Make sure iterating with the same rule [ , )
 * 
 */ 

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] nums =new int[n][n];
        int i, j;
        int count = 1;
        int startX = 0, startY = 0;
        int offset = 1;
        int loop =1;
        
        while (loop <= n / 2) {
            // n/2 is the number of circles

            for (j = startY; j < n-offset; j++ ) {
                nums[startX][j] = count++;
            }

            for(i = startX; i < n-offset; i++) {
                nums[i][j]=count++;
            }
            for(; j > startY; j--){
                //j的value延续上面的遍历
                nums[i][j]=count++;
            }
            for(; i>startX; i--) {
                nums[i][j]=count++;
            }
            startX++;
            startY++;
            offset++;
            loop++;
        }
        if(n % 2==1) {
            nums[startX][startY] = count;
        }
        return nums;
        
    }
}
// @lc code=end

