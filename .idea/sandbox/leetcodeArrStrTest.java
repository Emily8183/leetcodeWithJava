package sandbox;

public class leetcodeArrStrTest {

    public static void main(String[] args) {

        leetcodeArrStrTest leetcodeArrStrTest = new leetcodeArrStrTest();

        int[] nums = {1,3,5};
        int target = 5;
    
        Integer result  = leetcodeArrStrTest.searchInsert(nums, target);

        System.out.println(result);
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while ( left < right) {
            int mid = left + (right-left)/2; //to avoid overflow

            if (target < nums[mid]) {
                right = nums[mid];
            } else if (target > nums[mid]) {
                left = nums[mid] + 1;
            } else if (target == nums[mid]) {
                return mid;
            }

            left++;
            right--;
        }

        return left;


        
    }

   


    
}
