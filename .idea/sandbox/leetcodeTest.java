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
        String s = "abc";
        String t = "bcaaa";
      
        boolean result = leetcodeTest.isAnagram(s, t);
        System.out.println(result);
    }
    public boolean isAnagram(String s, String t) {

        int[] count = new int[26];

        for (int i=0; i< s.length();i++) {
            // int num = s.charAt(i)-'a';
            // System.out.println(num); 
            // 打印结果是0，1，2

            count[s.charAt(i) -'a'] ++;
        }

        for (int i=0; i< t.length();i++) {
            count[t.charAt(i) -'a']--;
        }

        for (int i=0; i < count.length; i++) {
            if (count[i] != 0) {
            return false;
            }
        }
        //还有另一种写法，for(int count:record)

        return true;
        
    }
}
    

