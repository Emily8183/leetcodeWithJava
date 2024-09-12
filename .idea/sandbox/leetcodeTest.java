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
        String str = "pwwkew"; 

        int result = leetcodeTest.lengthOfLongestSubstring(str);

        System.out.println(result); 
    
    }

    private int lengthOfLongestSubstring(String s) {

        char[] arr = s.toCharArray();

        Set<Character> hashset = new HashSet<>();

        int maxLength = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for ( char a : arr ) {
                hashset.add(a);

                if (hashset.contains(a)) {        
                    break;
                }
            }



            hashset.add(arr[i]);

            maxLength = Math.max(hashset.size(),maxLength);


        }

        return maxLength;

}
}

    

