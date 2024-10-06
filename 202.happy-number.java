/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start

import java.util.Set;

class Solution {
    public boolean isHappy(int n) {

        //使用哈希set来解此题
        Set<Integer> record = new HashSet<>();
        while (n != 1 && !record.contains(n)) {
            record.add(n);
            n = getNext(n);        
        }
        
        return n==1;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while(n >0) { // 1 % 10 = 0; 1/10=0, so when n is 1, the loop breaks
            int temp = n % 10;
            totalSum += temp * temp;
            n = n/10;
        }
        return totalSum;
    }
}
// @lc code=end

