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
        int[] nums = {1,2,3,4,5,6,7}; 

        leetcodeTest.reverseArray(nums, 3);

        System.out.println(Arrays.toString(nums)); 
   
    }

    private void reverseArray(int[] nums, int k) {

        k = k % nums.length; 
        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k);
        reverse(nums, k+1, nums.length-1);
    }

    private void reverse (int[] nums, int start, int end) {

        if(start >= end) return;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
    

