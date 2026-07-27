public class SubArray {

    public static void Subarray(int num[]){
        int tp =0;
        for(int i= 0; i<num.length ; i++){ //starting element
            int start=i;
            for(int j = i; j<num.length; j++){//ending element
                int end = j;
                for(int k =start; k<=end; k++){//print elements
                    tp++ ;
                    System.out.print(num[k] + " " );    
                }
                System.out.println();
            }
          System.out.println();
        }
        System.out.println("total no of subArray: " + tp);
    }
    public static void main(String[] args) {
     int num[]= {2, 4, 6, 8, 9};
     Subarray(num);
    }
}
