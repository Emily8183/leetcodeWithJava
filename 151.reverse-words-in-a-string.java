/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 * 
 * //我的思路是先把句子中的词split成item，比如" hello world", 切成["hello", "world"],但是这样使用库函数,增加空间

正确的解题思路如下：

移除多余空格(单独做一个辅助函数来实现)
将整个字符串反转
将每个单词反转
 */

// @lc code=start
class Solution {

        //用 char[] 来实现 String 的 removeExtraSpaces，reverse 操作,蕞后用return new String来转回String,一共用到三个辅助函数
        public String reverseWords(String s) {
            char[] chars = s.toCharArray();
            //1.去除首尾以及中间多余空格
            chars = removeExtraSpaces(chars);
            //2.整个字符串反转
            reverse(chars, 0, chars.length - 1);
            //3.单词反转
            reverseEachWord(chars);
            return new String(chars);
        }
    
        //1.用 快慢指针 去除首尾以及中间多余空格，可参考数组第27题元素移除的题解
        //例如"  the sky s"，当fast=5是空时，跳过循环，fast=6，即s，此时slow不是0，因此加一个空格
        public char[] removeExtraSpaces(char[] chars) {
            int slow = 0;
            for (int fast = 0; fast < chars.length; fast++) {
                //先用 fast 移除所有空格
                if (chars[fast] != ' ') {
                    //再用 slow 加空格。 除第一个单词外，单词末尾要加空格
                    if (slow != 0)
                        chars[slow++] = ' '; //随后slow的值+1
                    //fast 遇到空格或遍历到字符串末尾，就证明遍历完一个单词了。while可以确保遍历完整个单词
                    while (fast < chars.length && chars[fast] != ' ')
                        chars[slow++] = chars[fast++];
                }
            }
            //相当于 c++ 里的 resize()
            char[] newChars = new char[slow];
            System.arraycopy(chars, 0, newChars, 0, slow); 
            return newChars;
        }
    
        //双指针实现指定范围内字符串反转，可参考LC344字符串反转题解
        public void reverse(char[] chars, int left, int right) {
            // if (right >= chars.length) {
                // System.out.println("set a wrong right");
                // return;
            // }

            if(left>=right) return;

            while (left < right) {
                char temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                right--;
                left++;
               
            }
        }
    
        //3.单词反转
        public void reverseEachWord(char[] chars) {
            int start = 0;
            //end <= s.length() 这里的 = ，是为了让 end 永远指向单词末尾后一个位置，这样 reverse 的实参更好设置
            for (int end = 0; end <= chars.length; end++) {
                // end 每次到单词末尾后的空格或串尾,开始反转单词
                if (end == chars.length || chars[end] == ' ') {
                    reverse(chars, start, end - 1); //这里call上面的reverse函数
                    start = end + 1; // end 此时指向的是单词后的空格（或字符串的末尾），所以下一个单词的起始位置应该是 end 的下一个位置，即 end + 1。
                }
            }
        }
    
}
// @lc code=end

