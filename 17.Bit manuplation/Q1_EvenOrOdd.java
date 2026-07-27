import java.util.*;
public class Q1_EvenOrOdd {

    public static String evenOrOdd(int n){
        if((n & 1) == 0){
            return "Even";
        }else{
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(evenOrOdd(n));
    }
}