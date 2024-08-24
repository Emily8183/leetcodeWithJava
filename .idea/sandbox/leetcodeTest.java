package sandbox;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcodeTest {
    private List<List<String>> result = new ArrayList<>();
    private LinkedList<String> path = new LinkedList<>();
    
    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
        String s = "aab";
   
        List<List<String>> subsets = leetcodeTest.partition(s) ;
        System.out.println(subsets);
    }

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
    

