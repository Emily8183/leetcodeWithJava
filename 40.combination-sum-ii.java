/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
//本题题目中可能会有重复的元素，但是result不能有重复的组合。如何去重是关键点
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path =new LinkedList<>();
    boolean[] used;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        used = new boolean[candidates.length]; // used长度等同于candidates长度
        Arrays.fill(used, false); //每一个设置为false

        Arrays.sort(candidates);//注意因为这题需要去重,所以要先排序
        backtracking(target, candidates, 0,0);
        return result;        
    }

    private void backtracking(int target, int[]candidates, int sum, int startIndex){

        // if (sum >target) return; 把剪枝放到下面效果更好

    
        if(sum == target){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i= startIndex; i < candidates.length; i++){
            if(sum+candidates[i]>target) break;
            
        //在sorted array的基础上,把重复的元素去掉
        if(i > 0 && candidates[i]==candidates[i-1] && used[i-1]==false) continue;
        // OR   if(i > startIndex && candidates[i]==candidates[i-1]) continue;
        // 也可以直接用i > startIndex去重，确保只在同一层级进行去重,这样就不需要used数组去重了
            used[i]=true;
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(target, candidates, sum, i+1); // 和39.组合总和的区别1，这里是i+1，每个数字在每个组合中只能使用一次
            used[i]=false;
            sum-=candidates[i];
            path.removeLast();

        }

    }
}
// @lc code=end

