/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 *      //same solution. but pay attention to the coding method
        //sort first, and need to use ArrayList<>() to edit easily
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort the intervals based on the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();

        //Solution 1: use the Array.get() method
        // for (int i = 0; i < intervals.length; i++) {
        //     // If the list of merged intervals is empty or the current interval does not overlap with the previous, add it.
        //     if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < intervals[i][0]) {
        //         //OR merged.isEmpty()
        //         merged.add(intervals[i]);
        //     } else {
        //         // There is overlap, so merge the current and previous intervals.
        //         merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
        //     }
        // }

        //Solution 2: 
        int[] currentInterval = intervals[0];

        merged.add(currentInterval);


        for (int i=1; i < intervals.length; i++) {

            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) {

                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                currentInterval = nextInterval;
                merged.add(currentInterval);
          }

        }

        return merged.toArray(new int[merged.size()][]);
    }
    
}
// @lc code=end

