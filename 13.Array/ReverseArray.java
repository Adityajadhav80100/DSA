

public class ReverseArray {
    //reverse Array
    public static void Reverse(int num[]){
       int tem =0;
        int start=0;
        int end = num.length - 1 ;
        while (start < end) {
              tem = num[end] ;
              num[end] = num[start] ;
              num[start] = tem;
              start ++;
              end--;
     }
    }

     public static void main(String[] args) {
       int num[]= {2, 4, 6, 8, 9};
        Reverse(num);
        //print
        for(int i = 0; i<num.length ; i++) {
        System.out.print(  num[i] + " ");
        }
        System.out.println();
     }
}
