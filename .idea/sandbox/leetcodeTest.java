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

        int farthestPoint = 0; //未来时

        int currentCoverage =0; //现在时

        int jump = 0;

        if(n==1) return 0;

        for (int i=0; i<=farthestPoint && i<n-1; i++) {

            farthestPoint = Math.max(farthestPoint, nums[i]+i);

            if(i == currentCoverage) { // 当下标等于当前覆盖最远距离的下标
                currentCoverage=farthestPoint; 
                jump++;
            }
        
        }

        return jump;
    }
}
    

