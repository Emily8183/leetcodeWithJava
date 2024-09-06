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
        int[] nums = {2,3,1,1,4}; 
       
        int result = leetcodeTest.jump(nums);

        System.out.println(result); 
   
    }
    public int jump(int[] nums) {

        int n=nums.length;

        int j = 0;//farthest

        int coverage =0;

        int jump = 0;

        if(n==1) return 0;

        for (int i=0; i<=n-1; i++) {
            j = Math.max(j, nums[i]+i);

            if(i== coverage) {
                jump++;
                coverage = j;
            }

            if(coverage >n) break;
            
        
        }

        return jump;

        
    }
}
    

