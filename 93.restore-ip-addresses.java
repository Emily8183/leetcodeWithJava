/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */
// 题目：A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
// For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
// Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

//  Coding practice: 1) String.join 2)Integer.parseInt 3) String.startsWith 4) break

// @lc code=start
class Solution {
    List<String> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) return result; // IP 地址最多12个字符，如果s.length超过12，直接返回空结果
        backtracking(s, 0);
        return result;
    }

    private void backtracking(String s, int startIndex) {
        // 如果当前 path 里有四段且刚好遍历完字符串，那就是一个合法的 IP 地址
        if (path.size() == 4 && startIndex == s.length()) {
            result.add(String.join(".", path));
            return;
        }

        // 如果已经分成四段但还没遍历完字符串，直接返回
        // if (path.size() == 4 && startIndex < s.length()) return;

        for (int i = startIndex; i < s.length(); i++) {
            String segment = s.substring(startIndex, i + 1);

            // 如果分割出的字符串不合法（比如大于255或者有前导零），跳过
            if (Integer.parseInt(segment) > 255 || (segment.length() > 1 && segment.startsWith("0"))) {
                break;
            }

            path.add(segment);
            backtracking(s, i + 1);
            path.removeLast(); // 回溯，撤销选择
        }
    }
}
// @lc code=end

