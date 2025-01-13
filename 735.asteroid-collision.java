/*
 * @lc app=leetcode id=735 lang=java
 *
 * [735] Asteroid Collision
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            int size = asteroids[i];

            if (size > 0) stack.add(asteroids[i]);
            else {
            //fly to left
                if (stack.isEmpty() || stack.peek() < 0) {
                    stack.add(size);
                } else if (Math.abs(stack.peek()) <= Math.abs(size)) {

                    if (Math.abs(stack.peek()) < Math.abs(size)) i--; //这里不能用continue，如果用continue，看notes里的正确版本

                    stack.pop();
                } 

            }    
        }

        //此时已经知道新的stack的长度，因此可以直接用int[]

        int[] arr = new int[stack.size()];

        for(int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }

        return arr;
        
    }
}
// @lc code=end

