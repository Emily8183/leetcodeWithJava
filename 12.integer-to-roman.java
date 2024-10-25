/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {

//方法1：在linkedList中 loop，把特殊的case放进list。还有另一个方法，搜youtube一姐
        LinkedList<Object[]> romanValues = new LinkedList<>();

        // Each Object[] contains an Integer and a String
        romanValues.add(new Object[]{1000, "M"});
        romanValues.add(new Object[]{900, "CM"});
        romanValues.add(new Object[]{500, "D"});
        romanValues.add(new Object[]{400, "CD"});
        romanValues.add(new Object[]{100, "C"});
        romanValues.add(new Object[]{90, "XC"});
        romanValues.add(new Object[]{50, "L"});
        romanValues.add(new Object[]{40, "XL"});
        romanValues.add(new Object[]{10, "X"});
        romanValues.add(new Object[]{9, "IX"});
        romanValues.add(new Object[]{5, "V"});
        romanValues.add(new Object[]{4, "IV"});
        romanValues.add(new Object[]{1, "I"});

        StringBuilder sb = new StringBuilder();

        //loop through each value-symbol pair in the list
        for (Object[] pair : romanValues) {
            int value = (int) pair[0];
            String symbol = (String) pair[1];

            if(num / value > 0) {
                int count = num / value; //数一下有多少个value，比如4200/1000，得出4，因此需要打印4个M

            for (int i = 0; i < count; i++) {
                sb.append(symbol);
            }

            num %= value;
            }
        }

        return sb.toString();
        
    }
}
// @lc code=end

