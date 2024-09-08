/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        
        for ( int i = 0; i < intervals.length; i++) {

            //如果newInterval的左边界大于intervals蕞后一个区间的右区间,result内先依次加入intervals的各个区间
            if ( newInterval[0] > intervals[i][1]) {
                result.add(intervals[i]); //这里只是加了intervals, 没有把newInterval加到result
            
            } else if (newInterval[1] < intervals[i][0]) { //newInterval右边界在所有intervals左侧
                result.add(newInterval);

                while( i < intervals.length) {
                    result.add(intervals[i]);
                    i++;
                }

                return result.toArray(new int[result.size()][]);
                
            } else { //更新newInterval
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);  
            }
        }

        result.add(newInterval); //所以到这一步,interval更新后,加到result

        return result.toArray(new int[result.size()][]); //蕞后需要将ArrayList转为二维数组
        
    }
}
// @lc code=end

