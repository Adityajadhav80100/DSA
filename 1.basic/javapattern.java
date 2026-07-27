import java.util.Scanner;

public class javapattern {
     
   public static void Hollow_rectangle(int totRow , int totcol){
       //outer Row
       for( int i= 1 ; i<=totRow ; i++ ){
         //for outer col
         for(int j = 1; j<=totcol ; j++ ){
            //to print star on outer lines 
            if ( i ==1 || i == totRow || j == 1 || j == totcol ) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
       }
    }

    public static void inverted_rotetade_half_triangle(int n){
        //for the lines or row
        for(int i = 0; i<=n ; i++){
            //for spaces
            for(int j = 0; j <= n-i ; j++){
                System.out.print(" ");
            }
            //for stars
            for(int k =0 ; k <= i; k++){ 
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void floyds_triangle(int a){
        int counter = 1;
        for(int i = 1 ; i <= a ; i++ ){
            for(int j = 1 ; j <= i ; j++){
               System.out.print(counter + " ");
               counter++ ;
            }
            System.out.println();
        }
    }

    public static void  triangle(int  n ){
        for (int i = 0; i <= n ; i++){
            for (int j =0; j<=i; j++){
                if ((i+j)%2==0) {
                   System.out.print("1");
                }else{ 
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n ){
          //upper half
          for(int i=1 ; i<=n; i++){
            //star
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i ; j++ ){
                System.out.print("*");
            }

            System.out.println();
          }

          //Lower half
          for(int i=n ; i>=1; i--){
            //star
            for(int j=1; j<=i ; j++) {
                System.out.print("*");
            }
            //spaces
            for(int j=1 ; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=i ; j++ ){
                System.out.print("*");
            }

            System.out.println();
          }

    }

    public static void solid_rhombus(int n){
         for(int i= 1; i<=n ;  i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            //stars
            for(int j =1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
    
   public static void Hollow_rhombus(int n ){
    for(int i = 1; i<=n ; i++){
        //spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        //starts
        for(int j = 1; j<=n; j++){
            if (i==1|| i==n || j==1 || j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
   }

   public static void Diamond(int n ){
    //first half
    for (int i= 1; i<=n ; i++){
        //spaces
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
 
        //stars 
        for (int j=1; j<=(2*i-1); j++){
           System.out.print("*");
        }
        System.out.println();
    }
    //Second half
    for (int i= n; i>=1 ; i--){
        //spaces
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
 
        //stars 
        for (int j=1; j<=(2*i-1); j++){
           System.out.print("*");
        }
        System.out.println();
    }
   }
    public static void num_pyramid(int n ){
    //first half
    for (int i= 1; i<=n ; i++){
        //spaces
         for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
 
        //stars 
        for (int j=1; j<=i; j++){
           System.out.print(i  + " ");
        }
        System.out.println();
    }
}

public static void palindrome_num_pyramid(int n){
    for(int i =1 ; i<=n; i++ ){
        //spaces
        for(int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        //num decending
         for (int j=i; j>=1; j--){
           System.out.print(j );
        }
        //ascending
        for (int j=2 ; j<=i ; j++){
            System.out.print(j);
        }
        System.out.println(); 
    }

}
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
    //   int b = sc.nextInt();
    //   Hollow_rectangle(a,b);
    //   inverted_rotetade_half_triangle(a);
    //   floyds_triangle(a);
    //   triangle(a);
    //   butterfly(a);
    //   solid_rhombus(a);
    //   Hollow_rhombus(a);
    //   Diamond(a);
    //  num_pyramid(a);
    palindrome_num_pyramid(a);
    }
}
