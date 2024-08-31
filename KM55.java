/*
思路：先把整体string的所有字母反转
分为两段，length -n 和n
反转后，把这两段的字母顺序反转即可 
*/

public class KM55 {
    public static void main(String[] args) {
       KM55 km55=new KM55();

       String s = "abcdefg";
       char[] charS=s.toCharArray();
       int k = 2;

       char[] convertString = km55.convert(charS,0,charS.length-1);
       //convert the entire string, from "abcdefg" to "gfedcba"

       char[] convertKchars = km55.convert(convertString, 0, k-1);
       //convert the string to "fgedcba"

       char[] convertRestchars = km55.convert(convertKchars, k, convertKchars.length-1);
       //convert the string to "fgabcde"

       System.out.println(convertRestchars); 
    }

    private char[] convert(char[] charsSample, int start, int end) {

      while(start<end) {
        char temp = charsSample[end];
        charsSample[end] = charsSample[start];
        charsSample[start] = temp;
        start++;
        end--;
      }

      return charsSample;

    }  
}
