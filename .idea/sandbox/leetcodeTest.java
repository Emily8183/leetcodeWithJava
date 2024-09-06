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
       
        boolean result = leetcodeTest.canJump(nums);

        System.out.println(result); 
   
    }
    public boolean canJump(int[] nums) {

        if (nums.length == 1) return true;

        int coverage =0;

        for(int i=0; i <= coverage; i++) { 
            coverage = Math.max(coverage, nums[i]+i);

            if(coverage>=nums.length-1) return true;

        }

        return false;


        
    }
}
    

