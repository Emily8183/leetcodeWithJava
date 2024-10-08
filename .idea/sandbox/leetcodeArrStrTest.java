package sandbox;

import java.util.HashMap;
import java.util.Map;

public class leetcodeArrStrTest {

    public static void main(String[] args) {

        leetcodeArrStrTest leetcodeArrStrTest = new leetcodeArrStrTest();

        String s = "abac";
        String t = "caab";
    
        Boolean result = leetcodeArrStrTest.checkletters(s,t);

        System.out.println(result);
    }

    public boolean checkletters(String s, String t) {

       
       if (s.length() != t.length()) return false;

       Map<Character, Integer> map = new HashMap<>();

       //map.put to add on all the key-value pair of the String s; key - "a", value - num
       for (int i = 0; i < s.length(); i++) {  

            char c = s.charAt(i); //i = 2

            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
       }

       //loop in String t, check 1) if the map contains the letter, 2) check the frequency, value--;
       for (int i = 0; i < t.length(); i++) {

            char c = t.charAt(i);

            if (!map.containsKey(c) || map.get(c) == 0) return false;

            map.put(c, map.get(c)-1); 
        }
       

       // a loop in the map, if all the value turns to 0, return true
       for (int num : map.values()) {
            if (num != 0) {
            return false;
            } 
        }

        return true; //all counts match
    }
}



    
       
       
        // if (s.length() != t.length()) {
        //     return false; 
        // }

        // Map<Character, Integer> map = new HashMap<>();

        // for (char c : s.toCharArray()) {
        //     map.put(c, map.getOrDefault(c, 0) + 1); 
        // }

        // for (char c : t.toCharArray()) {
        //     if (!map.containsKey(c)) {
        //         return false; 
        //     }

        //     map.put(c, map.get(c) - 1);  
        //     if (map.get(c) < 0) {
        //         return false; 
        //     }
        // }

        // for (int count : map.values()) {
        //     if (count != 0) {
        //         return false;
        //     }
        // }

        // return true;
   


    