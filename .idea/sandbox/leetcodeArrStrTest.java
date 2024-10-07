package sandbox;

public class leetcodeArrStrTest {

    public static void main(String[] args) {

        leetcodeArrStrTest leetcodeArrStrTest = new leetcodeArrStrTest();

        String s = "abcc";
        String t = "ccab";
    
        Boolean result = leetcodeArrStrTest.checkletters(s,t);

        System.out.println(result);
    }

    public boolean checkletters(String a, String b) {
        
        int[] arr = new int[26];

        for ( int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) -'a']++;
        }

        for ( int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 'a']--;
        }

        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
        
    }

   


    
}
