package sandbox;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class leetcodeTest {

    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
        int[] nums= {2,3,1,2,4,3};
        int target = 7;
   
        Integer result = leetcodeTest.minSubArrayLen(target, nums) ;
        System.out.println(result);
    }
    public int minSubArrayLen(int target, int[] nums) {
        //设定left和right指针，并把minLength定义为最大初始值
        int left = 0;
        int minLength = Integer.MAX_VALUE;
        int sum = 0;
 
        //将minLength的值与每一次找到的窗口长度进行比较，取较小值
        for(int right=0; right < nums.length; right++) {
            sum += nums[right];
 
            while(sum >= target) {
             minLength = Math.min(minLength, right-left+1); //先记录当下的minLength
             sum-=nums[left]; //再不断调整sum与left
             left++;
            }
         }
 
        //最后判断minLength是否等于Integer.MAX_VALUE，如果等于，说明没有找到满足条件的子数组，返回0，否则返回minLength
        return minLength== Integer.MAX_VALUE? 0:minLength;
     }
}
    

