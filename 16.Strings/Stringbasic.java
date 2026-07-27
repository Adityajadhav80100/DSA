import java.util.* ;

public class Stringbasic {

    public static void PrintStringChar(String str){
    for(int i=0 ; i<str.length(); i++){
        System.out.print(str.charAt(i)  + " ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        // String str = "Hello World" ;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        // System.out.println(str1.length());
        PrintStringChar(str1);
    }
}
