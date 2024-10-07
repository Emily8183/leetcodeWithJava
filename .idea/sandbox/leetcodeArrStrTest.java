package sandbox;

import java.util.HashMap;
import java.util.Map;

public class leetcodeArrStrTest {

    public static void main(String[] args) {

        leetcodeArrStrTest leetcodeArrStrTest = new leetcodeArrStrTest();

        String s = "abcc";
        String t = "cca";
    
        Boolean result = leetcodeArrStrTest.checkletters(s,t);

        System.out.println(result);
    }

    public boolean checkletters(String s, String t) {

        if (s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1); 
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; 
            }

            map.put(c, map.get(c) - 1);  
            if (map.get(c) < 0) {
                return false; 
            }
        }

        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;

        
    }

   


    
}
