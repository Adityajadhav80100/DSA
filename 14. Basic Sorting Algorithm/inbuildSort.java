import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class inbuildSort {
    public static void Printsort(Integer arr[]){
    for(int i =0; i<arr.length ;  i++){
        System.out.print(arr[i] + " " );
    }
}
  public static void main(String[] args) {
   int arr[]={5,9,2,4,6,3,};
   Integer arr1[]={5,9,2,4,6,3,};
  Arrays.sort(arr , 0,4); // it will sort from index 0 to 3 only
  Arrays.sort(arr1 , Collections.reverseOrder()); // it will sort from index 0 to 3 only
   
    Printsort(arr1);
  }
}
