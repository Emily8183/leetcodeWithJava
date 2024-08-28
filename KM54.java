/*
 * KamaCoder: 
 * 给定一个字符串 s，它包含小写字母和数字字符，请编写一个函数，将字符串中的字母字符保持不变，而将每个数字字符替换为number。 例如，对于输入字符串 "a1b2c3"，函数应该将其转换为 "anumberbnumbercnumber"。
 * 
 * 
 * 1）数一下给到s中有几个数字，新字符串的长度为：字母+数字*number；
 * 2) 创建一个新array储存新的数据
 * 3）从后往前遍历，使用双指针，一个指针指向s[nums], 如果指向字母，就填写，如果指向数字，则向后往前填rebmun
 * 4）将结果中的array转到string：String(newArray)
 */

import java.util.Scanner;

public class KM54 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            System.out.println(replaceNumber(s));
            scanner.close();
    }

    public static String replaceNumber(String s) {
        int count = 0;
        int stringOldSize = s.length();
        
        //count the number of digits
        for (int i=0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                count++;
            }
        }

        //create a new array
        char[] newArray = new char[s.length()+count*5];
        int newArraySize = newArray.length;

        //copy the string to the new array, 新的array填写和原先array一样的数字，外加一串空格
        System.arraycopy(s.toCharArray(), 0, newArray, 0, stringOldSize);
        
        //遍历，从后向前更新
        for(int i=newArraySize-1, j = stringOldSize-1; j<i; i--, j--) {
            if(!Character.isDigit(newArray[j])){
                newArray[i] = newArray[j];

            } else {
                    newArray[i] = 'r';
                    newArray[i - 1] = 'e';
                    newArray[i - 2] = 'b';
                    newArray[i - 3] = 'm';
                    newArray[i - 4] = 'u';
                    newArray[i - 5] = 'n';
                    i -= 5;
            } 
        
        }
        return new String(newArray);
    }
    
}
