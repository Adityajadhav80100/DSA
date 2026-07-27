import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

public class ArrayCC {

   public static void updating(int marks[], int isnonchangable) {
      // updating values
      isnonchangable = 10;
      for (int i = 0; i < marks.length; i++) {
         marks[i] = marks[i] + 1;
      }
   }

   public static int lenear_Search(int number[], int key, String fruits[], String tofind) {
      // now searching key in array
      for (int i = 0; i < number.length; i++) {
         if (number[i] == key) {
            return i;
         }
      }
      return -1;
   }

   // Linear search for a string in a string array
   public static int linearSearchString(String arr[], String target) {
      for (int i = 0; i < arr.length; i++) {
         if (arr[i].equals(target)) {
            return i;
         }
      }
      return -1;
   }

   // largest number in array
   public static int Largest_num(int number[]) {
     int   largest = Integer.MIN_VALUE;
     int smallest = Integer.MAX_VALUE;
      for (int i = 0; i < number.length; i++) {
         if (largest < number[i]) {
            largest = number[i];
         }
         if (smallest>number[i]){
            smallest=number[i];
            System.out.println(smallest);
         }
      }
      return largest;
   }

   public static void main(String[] args) {
     // Performing input output operations   
    // int marks[] = new int[50];
    //     Scanner sc = new Scanner(System.in);
    //     marks[0] = sc.nextInt();
    //     marks[1] = sc.nextInt();
    //     marks[2] = sc.nextInt();
    //     System.out.println("phy:" + marks[0]);
    //     System.out.println("math:" + marks[1]);
    //     System.out.println("chem:" + marks[2]);

     // //correcting the marks
    //     marks[2] = marks[2] + 4;
    //     System.out.println("chem:" + marks[2]);
    //     //percentage
    //     int percentage = marks[0] + marks[1] + marks[2] / 3 ;
    //     System.out.println("percentage :" + percentage);
        
 
   //Passing Array by References
//      int marks[] = {69 , 82, 98} ;
//      int isnonchangable = 6;
//    updating(marks , isnonchangable);
//     System.out.println(isnonchangable);
//      for(int i = 0; i<marks.length; i++){
//         System.out.println("marks:" + marks[i]);
//      }
//     //  System.out.println(Arrays.toString(marks));
//      System.out.println();





    //lenear search in array
      
    // int number[] = { 1 , 2 , 5 , 10 , 12 , 16 , 19 , 20 };
         // String fruits [] = {  "graps" , "Mango" , "Banana" , "peru" ,"Dragon-fruit" , "chiku" };
         // String tofind = "Dragon-fruit" ;
         // int key = 10 ;
         // int index = lenear_Search(number, key , fruits , tofind);
         // if (index == -1) {
         //    System.out.println("Key NOT Found !!");
         // } else{
         //    System.out.println("Key is found on index :" + index);
         // }

    // // Linear search for string in fruits array
         // int fruitIndex = linearSearchString(fruits, tofind);
         // if (fruitIndex == -1) {
         //    System.out.println("Fruit NOT Found !!");
         // } else {
         //    System.out.println("Fruit '" + tofind + "' found at index: " + fruitIndex);
         // }

      //finding largest number in array
           int number[] = { 1 , 2 , 5 , 10 , 12 , 16 , 19 , 20 };
             System.out.println(  Largest_num(number)  );
             
   }
}
