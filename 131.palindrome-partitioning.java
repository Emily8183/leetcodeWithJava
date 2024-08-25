/*
 * @lc app=leetcode id=131 lang=java
 *
 * [131] Palindrome Partitioning
 */
// 题目：Given a string s, partition s such that every substringof the partition is a palindrome. Return all possible palindrome partitioning of s.

// @lc code=start
class Solution {
    List<List<String>> result = new ArrayList<>();
    LinkedList<String> path = new LinkedList<>();
    public List<List<String>> partition(String s) {

            backtracking(s,0);
            return result;
    }

    private void backtracking(String s, int startIndex){
        if(startIndex>=s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = startIndex; i < s.length(); i++){
            if(isPalindrome(s,startIndex,i)){
                String str = s.substring(startIndex,i+1);
                path.add(str);
            }else{
                continue;
            }

            backtracking(s,i+1);
            path.removeLast();
        }
    }

        private boolean isPalindrome(String s, int start, int end) {
            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                } 
                start++;
                end--;
            }

            return true;
                       
        }
        
}
// @lc code=end

