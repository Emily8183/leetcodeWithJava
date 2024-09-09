package sandbox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class leetcodeTest {

    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}}; 

        int[][] mergedIntervals = leetcodeTest.merge(intervals);

        // 打印二维数组
        for (int[] interval : mergedIntervals) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]"); 
        }

    }

    private int[][] merge(int[][] intervals) {

       // Sort the intervals based on the start time
    //    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

    //    List<int[]> merged = new ArrayList<>();

    //    for (int i = 0; i < intervals.length; i++) {
    //        // If the list of merged intervals is empty or the current interval does not overlap with the previous, add it.
    //        if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < intervals[i][0]) {
    //            merged.add(intervals[i]);
    //        } else {
    //            // There is overlap, so merge the current and previous intervals.
    //            merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
    //        }
    //    }

    //    return merged.toArray(new int[merged.size()][]);
   

        if(intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        ArrayList<int[]> result = new ArrayList<>();

        int[] currentInterval = intervals[0];

        result.add(currentInterval);


        for (int i=1; i < intervals.length; i++) {

            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) {

                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                currentInterval = nextInterval;
                result.add(currentInterval);
          }

        }

   

        return result.toArray(new int[result.size()][]);

}
}

    

