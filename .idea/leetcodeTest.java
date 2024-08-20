import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcodeTest {
    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    boolean[] used;
    
    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
        int[] nums = {1, 2, 2}; // 示例输入
        List<List<Integer>> subsets = leetcodeTest.subsetsWithDup(nums);
        System.out.println(subsets);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        used=new boolean[nums.length];
        backtracking(nums, 0);
        return result;
    }

    private void backtracking(int[] nums, int startIndex) {
        result.add(new ArrayList<>(path));

        if (startIndex >= nums.length) return;

        for (int i = startIndex; i < nums.length; i++) {
            if (i > startIndex && nums[i] == nums[i - 1] && !used[i-1]) continue; // 去重
            path.add(nums[i]);
            used[i]=true;
            backtracking(nums, i + 1);
            path.removeLast();
            used[i]=false;
        }
    }
}
    

