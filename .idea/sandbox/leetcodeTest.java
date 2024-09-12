package sandbox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import javax.swing.tree.TreeNode;

public class leetcodeTest {

    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
        int[] nums = {0,0,2,1,1,2}; 

        leetcodeTest.sortColors(nums);

        System.out.println(nums); 
    
    }

    private void sortColors(int[] nums) {

        int left = 0;
        int right = nums.length-1;


        for ( int i = 0; i < nums.length; i++) {

            while( left < right) {

                if (nums[i] == 2) {
                     nums[i] = nums[right];
                     nums[right] = 2;
                     right--;
                 } else if (nums[i] == 0) {
                     nums[i] = nums[left];
                     nums[left] = 0;
                     left++;
                 }
             }
        }
        
    }

}

    

