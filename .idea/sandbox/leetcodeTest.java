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
        int[] nums = {2,2,2,2,2}; 

        List<List<Integer>> result = leetcodeTest.foursum(nums, 8);

        System.out.println(result); 
    
    }

    private List<List<Integer>> foursum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            //当nums[i]是正数，且大于target，不需要继续向后遍历
            if (nums[i] >= 0 && nums[i] > target) break;

            //去重, 避免重新处理同样的i元素
            if (i > 0 && nums[i-1] == nums[i]) continue;

            for (int j = i+1; j < nums.length; j++) {

                //当nums[i]+nums[j]是正数，且大于target，不需要继续向后遍历
                 if (nums[i]+nums[j] >= 0 && nums[i]+nums[j] > target) break;

                //对j进行去重
                if (j > i+1 && nums[j-1] == nums[j]) continue;

                //双指针
                int left = j+1;
                int right = nums.length-1;

                while (left < right) {
                    int sum = nums[i]+nums[j]+nums[left]+nums[right];

                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                         res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left+1]) left++;//left去重
                        while (right > left && nums[right-1] == nums[right]) right--; //right去重

                         left++;
                         right--;
                    }
                }
            }
        }
        return res;

}
}

    

