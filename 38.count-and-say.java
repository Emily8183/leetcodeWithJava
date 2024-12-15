/*
 * @lc app=leetcode id=38 lang=java
 *
 * [38] Count and Say
 */

// @lc code=start
class Solution {
    public String countAndSay(int n) {

        StringBuilder sb = new StringBuilder();

        String str = "1";
    
        char start = str.charAt(0);
    
        int count = 0;
    
        while (n >= 0) {
    
            for (int j = 0; j < str.length(); j++) {
    
                char c = str.charAt(j);
    
                if (c == start) {        
                    count++;
                } else {
                    sb.append(count).append(start);
                    count = 1;   
                    start = str.charAt(j);
                }
    
            }
    
            n--;
        }
    
        sb.append(count).append(start);
    
        return sb.toString();
        
        
    }
}
// @lc code=end

