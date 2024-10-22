package sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcodeArrStrTest {

    public static void main(String[] args) {

        leetcodeArrStrTest leetcodeArrStrTest = new leetcodeArrStrTest();

        int[] nums = {0,1,2,4,5,7};

        List<String> result = leetcodeArrStrTest.summaryRanges(nums);

        System.out.println(result);
    }

    public List<String> summaryRanges(int[] nums) {

       List<String> result = new ArrayList<String>();
        int start = 0;
        
        for (int end = 0; end < nums.length; end++) {
            if(end+1 < nums.length && nums[end+1] == nums[end] + 1) {
                continue;
            } 

            if (end == start) {
                result.add(String.valueOf(nums[start]));
            } else { 
                result.add(nums[start] + "->" + nums[end]);
            }

            start = end+1;
            
        }

       return result;
    }
}



    
       
       
        // if (s.length() != t.length()) {
        //     return false; 
        // }

        // Map<Character, Integer> map = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) + 1); 
        // }

        // for (char c : t.toCharArray()) {
        //     if (!map.containsKey(c)) {
        //         return false; 
        //     }

        //     map.put(c, map.get(c) - 1);  
        //     if (map.get(c) < 0) {
        //         return false; 
        //     }
        // }

        // for (int count : map.values()) {
        //     if (count != 0) {
        //         return false;
        //     }
        // }

        // return true;
   


    