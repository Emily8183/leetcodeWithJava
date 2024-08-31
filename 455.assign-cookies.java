/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        
        int j = s.length-1; //j不能作为局部变量放在for loop 内
    

        for(int i=g.length-1; i>=0; i--) {
          
            if(j>=0 && s[j]>=g[i]){ //这里是if,不是while
                result ++;
                j--;

            }
        }

        return result;

        
    }
}
// @lc code=end

