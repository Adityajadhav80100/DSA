public class max_Sum_subarray {
    public static void Max_Sum_Subarray(int num[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length ; i++){
            for(int j = i ; j<num.length; j++){
                curr_sum = 0;
                for(int k = i; k<=j; k++){
                     curr_sum = curr_sum +num[k] ;
                     System.out.print(num[k] + " ");
                    }
                    System.out.print(  " = " + curr_sum);
                    System.err.println();
                    if (curr_sum>max_sum) {
                        max_sum = curr_sum ;
                    }
                // System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum will be :"+max_sum);
    }
    public static void main(String[] args) {
         int num[]= {1, -2, 6, -1, 3}; 
         Max_Sum_Subarray(num);
    }
}

