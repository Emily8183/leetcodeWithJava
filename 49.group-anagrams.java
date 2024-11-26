/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        
        //把数组对应的index作为value存储
        Map<String,Integer>  map = new HashMap<>();

        for (String str: strs) {
            String pattern = getPattern(str);

            if (map.containsKey(pattern)) { //检查string有没有123
                result.get(map.get(pattern)).add(str); //map.get(123), 出来的是索引; result.get(索引)
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str); //add"tea"
                result.add(temp);
                map.put(pattern, result.size()-1); 
                //["123", 0], 新分组在 result 的位置是索引 0，即 result.size()-1 = 1-1 = 0
            }
        }

        return result;
        
    }

    private String getPattern(String str) {
        int[] pattern = new int[26];

        for (char c : str.toCharArray()) {
            pattern[c - 'a']++; //这里的pattern是一个数字, 比如“123”
        }

        return Arrays.toString(pattern);
    }
}
// @lc code=end

