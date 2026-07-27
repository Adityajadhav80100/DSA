import java.util.*;

public class Q4_LetterToUpperCase {

    public static String FirstLetterToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
         sb.append(Character.toUpperCase(str.charAt(0)));
 
         for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
         }
         return sb.toString();
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println(FirstLetterToUpperCase(str));
    }
}