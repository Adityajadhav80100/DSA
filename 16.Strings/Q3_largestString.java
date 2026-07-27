import java.util.*;

public class Q3_largestString {
  //time complexity is O(n*x) where x is compareTo() method time complexity and n is the length of array
    public static void main(String[] args) {
        String foods[] = {
                "Pizza",
                "Burger",
                "Pasta",
                "siryani",
                "Dosa"
        };

        String largest = foods[0];
        for(int i=1 ; i<foods.length; i++){
            if( largest.compareTo(foods[i])<0){
                largest = foods[i];
            }
        }
        System.out.println("Largest String is : " + largest);
    }
}
