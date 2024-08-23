package sandbox;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leetcodeTest {
    private List<List<Integer>> result = new ArrayList<>();
    private LinkedList<Integer> path = new LinkedList<>();
    
    public static void main(String[] args) {
        leetcodeTest leetcodeTest = new leetcodeTest();
   
        List<List<Integer>> subsets = leetcodeTest.combine(4,3) ;
        System.out.println(subsets);
    }

    public List<List<Integer>> combine(int n, int k) {
        backtracking(n,k, 1);
        return result;        
    }

    public void backtracking(int n, int k, int startIndex) {
        if(path.size()==k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=startIndex; i <= n-(k-path.size())+1; i++) {
            path.add(i);
            backtracking(n,k,i+1);
            path.removeLast();
        }
        //i所代表的不是下标，而是数字。因为这个数组是从1开始的，第一次遍历时，i等于数字1，把i加入path，相当于把数组中第一个数字（数字1）加入到path

    }
    
}
    

