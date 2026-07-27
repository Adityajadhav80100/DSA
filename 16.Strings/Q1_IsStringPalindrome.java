import java.util.*;

public class Q1_IsStringPalindrome {
    
    public static void IsPalindrome(String str){
        for(int i=0 ; i<str.length()/2 ; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        String  str1 = Sc.nextLine();
        IsPalindrome(str1);
    }

}
