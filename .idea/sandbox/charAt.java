package sandbox;

public class charAt {
    private static final String[] numString={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
   
    public static void main(String[] args) {
        String digits="23";
        charAt test = new charAt();
        String str = test.numString[digits.charAt(0)-'0'];
        System.out.println(str);
       
    }
    
}
