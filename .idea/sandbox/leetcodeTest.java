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
        int [] nums = {-1,0,3,5,9,12};
        int target = 0;
        int result = leetcodeTest.search(nums, target);
        System.out.println(result);
    }
    public int search(int[] nums, int target) {
        //左闭右开
        int left =0;
        int right = nums.length;

        while(left < right)

        {
           int mid = left + (right-left)/2; 

           if(nums[mid] == target) 
           {
            return mid;
           } else if(nums[mid] < target){
            left = mid + 1;
           } else {right = mid;}

        }

        return -1;
    }
}
    

