/*
 * @lc app=leetcode id=438 lang=java
 *
 * [438] Find All Anagrams in a String
 */

// @lc code=start

import java.util.Map;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        //创建List来保存result，便于删减
        List<Integer> result = new ArrayList<>();

        //边界检查(如果return的是void, 则只需要写return)
        if (s.length() < p.length()) {
            return result;
        }

        //创建两个hashmap，hashmapS用来存储遍历过的元素，长度和p保持一致；另一个hashmapP用来存储p
        Map<Character, Integer> hashmapS = new HashMap<>();
        Map<Character, Integer> hashmapP = new HashMap<>();

        //统计hashmapP中的元素
        for (char ch: p.toCharArray()) {
            hashmapP.put(ch, hashmapP.getOrDefault(ch,0)+1);
        }

        //检查hashmapS，如果遍历的长度超过p，移除蕞左边的元素
        int windowSize = p.length();

        for ( int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            hashmapS.put(ch, hashmapS.getOrDefault(ch, 0)+1);

            if ( i >= windowSize) {

                char leftChar = s.charAt(i-windowSize);

                //remove from hashmap
                if ( hashmapS.get(leftChar) == 1) {
                    hashmapS.remove(leftChar);
                } else {
                    hashmapS.put(leftChar, hashmapS.get(leftChar)-1);
                }

            }

            
            //解法一：不断比较两个hashmap，当相等时，result.add index
            if (hashmapS.equals(hashmapP)) {
                result.add(i-windowSize+1);
            }

        }

        return result;        
    }
}
// @lc code=end

