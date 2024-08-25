/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */
// 题目：Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
// You may return the answer in any order.

// @lc code=start
class Solution {
    //设定两个全局变量
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n, k, 1);
        return result;        
    }

    public void backtracking(int n, int k, int startIndex) {
        if(path.size()==k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=startIndex; i <= n-(k-path.size())+1; i++) {
            path.add(i);//这道题没有给到数组，就说是从1开始，到n的数组。所以i=startIndex，startIndex从1开始。
            // startIndex: 它是当前递归层级的起始索引，表示当前递归调用中从哪个数字开始选择组合的下一个元素。i: 它是在当前递归层级中进行遍历的索引，表示当前正在尝试添加的数字。
            backtracking(n,k,i+1);
            path.removeLast();
        }

    }
}
// @lc code=end

