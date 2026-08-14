public class binarySearch {

    //binary search
    public static int binary_Search(int number[] , int Key){
        
        int start = 0;
        int end = number.length - 1 ;
      
        while (start<= end) {
          int  mid = (start + end) / 2 ;
          //camparison
          if (number[mid]== Key ) {
            return mid ;
          }
          
          if (number[mid]<Key) { //right
            start = mid + 1;
          } else  { //Left side
            end = mid -1 ;

          } 

        }
        return -1;

    }
      public static void main(String[] args) {
        //Binary search 
        int number[] ={ 2, 4, 6, 8, 10, 12, 14, 16, 18,};
        int key = 25;
       System.out.println("Index of key is :"+binary_Search(number, key));
      }
}
