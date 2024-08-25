package sandbox;
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
        int[] nums= {1,1,2};
   
        List<List<Integer>> subsets = leetcodeTest.permuteUnique(nums) ;
        System.out.println(subsets);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        used = new boolean[nums.length];
        Arrays.fill(used,false);
        Arrays.sort(nums);
        backtracking(nums, used);
        return result;
    }

    private void backtracking(int[] nums, boolean[] used){
        //used需要作为参数加进来

        if(path.size()== nums.length){
            result.add(new ArrayList<>(path));
        }

        for(int i=0; i <nums.length; i++){
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;

            if(!used[i]){

            used[i]= true;
            path.add(nums[i]);
            backtracking(nums, used);
            used[i] = false;
            path.removeLast();
            }


        }
}
}
    

