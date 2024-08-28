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
        char[] s ={'h', 'e', 'l', 'l', 'o'}; 
      
        String result = leetcodeTest.reverseString(s);
        System.out.println(result);
    }
    public String reverseString(char[] s) {

        reverse (s, 0, s.length-1);
        return new String(s);
        
    }

    private void reverse(char[] s, int left, int right) {

        if(left> right) return;
      
        while(left<=right){
            char temp = s[right];
            s[right] = s[left];

            s[left]= temp;

            right--;
            left++;
        }
    
    }

}
    

