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
        int[] nums = {0,1,0,3,12}; 
       
        leetcodeTest.moveZeroes(nums);

        // for(int num:nums) {
        //     System.out.println(num);
        // }

        System.out.println(Arrays.toString(nums)); 
   
    }
    public void moveZeroes(int[] nums) {

        int j=0;

        for(int i=0;i<nums.length;i++){
            // for(int j=0;j<nums.length;j++){
                if(nums[i]!=0) {
                    nums[j++]=nums[i];
                } 
        }

        for(int i= j;i<nums.length; i++){
            nums[i]=0;
        }  

        
    }
}
    

