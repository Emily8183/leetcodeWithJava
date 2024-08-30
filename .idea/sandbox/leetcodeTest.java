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
        String s = "  the sky s";   
        char[] sArray = s.toCharArray();
      
        char[] result = leetcodeTest.removeExtraSpaces(sArray);
        System.out.println(result);
    }
    public char[] removeExtraSpaces(char[] chars) {
        int slow = 0;
        for (int fast = 0; fast < chars.length; fast++) {
            //先用 fast 移除所有空格
            if (chars[fast] != ' ') {
                //再用 slow 加空格。 除第一个单词外，单词末尾要加空格
                if (slow != 0)
                    chars[slow++] = ' '; 
                //fast 遇到空格或遍历到字符串末尾，就证明遍历完一个单词了
                while (fast < chars.length)
                    chars[slow++] = chars[fast++];
            }
        }
        //相当于 c++ 里的 resize()
        char[] newChars = new char[slow];
        System.arraycopy(chars, 0, newChars, 0, slow); 
        return newChars;
    }

}
    

