import java.util.*;

public class javaBasic {
      
    public static int Multiply(int num1 , int num2){
        int sum = num1 * num2 ;
        return sum;
    }

    public static int Factorial(int a  ){
        int f = 1;
       for(int i=1; i<=a  ; i++){
          f=f*i;
        }
        System.out.println("factorial of a is :" + f);
        return f;
    }

     public static int BioFact(int n , int r){
        int Fact_n = Factorial(n);
        int Fact_r = Factorial(r);
        int Fact_nmr = Factorial(n-r);
        int  BioFact = Fact_n / (Fact_r * Fact_nmr);
        return BioFact;
     }

     public static boolean isprime(int n){
        if (n < 2) {
            return false;
        }
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
     }
   
     public static void PrimeinRange(int n){
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
     }

     public static void binToDec(int n){
        int binNum = n ;
        int pow = 0 ;
        int dec = 0 ;
        while(n > 0){
             int lastnum = n % 10 ;
             dec = dec + (lastnum * (int) Math.pow(2 , pow) ) ;
             pow++ ;
             n = n /10 ;
        }
        System.out.println("decimal of " + binNum + " = " + dec );
     }

     public static  void DecToBin(int n){
        int myNum = n;
        int  pow = 0 ;
        int binNum = 0 ;
        while (n>0) {
           int rem = n % 2 ;
           binNum = binNum + rem * (int) Math.pow(10 , pow);
           pow ++ ;
           n =  n / 2;
           
        }
        System.out.println("binary  of " + myNum + " = " + binNum );
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
    //   Factorial(a);
        //  PrimeinRange(a);
        DecToBin(a);
        // System.out.println(isprime(a  ));
    
    }
}