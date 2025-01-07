/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start
/*
condition: int[] people
people[i] => weight
int numOfBoat <= int limit; 
at most two indice for each boat
goal: minimum number of boats
solution: greedy + two pointers

*/

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int count = 0;

        int first = 0;

        int last = people.length-1;
        
        while (first <= last) {
            if (people[first] + people[last] > limit) {
                count++;
                last--;
            } else {
                count++;
                first++;
                last--;
            }

        }

        return count;
    }
}
// @lc code=end

