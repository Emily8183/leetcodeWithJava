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
        int[] nums = {4,1,4,4,3,3};   
       
        Integer candidate = leetcodeTest.search(nums);
        System.out.println(candidate);
    }
    public Integer search(int[] nums) {
        int count =0;
        Integer candidate = null;

        for(int num: nums) {
            if(count == 0) {
                candidate = num;
            }

            count += (num==candidate) ? 1: -1;
        }

        return candidate;
    }

}
    

