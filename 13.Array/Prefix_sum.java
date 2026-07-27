public class Prefix_sum {
    public static void Max_Sum_Subarray(int num[]){
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
         int Prefix[] = new int[ num.length];
              
         Prefix[0] = num[0];
        //  Creating prefixed array
        for(int i=1 ; i<Prefix.length; i++){
            Prefix[i] = Prefix[i-1] + num[i];
            System.out.println(Prefix[i]);
        }

        for(int i = 0; i<num.length ; i++){//start
            for(int j = i ; j<num.length; j++){//end
                curr_sum = i== 0 ? Prefix[j] : Prefix[j] - Prefix[i-1] ;
                
                    if (curr_sum>max_sum) {
                        max_sum = curr_sum ;
                    }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("max sum will be :"+max_sum);
    }
    public static void main(String[] args) {
         int num[]= {1, -2, 6, -1, 3}; 
         Max_Sum_Subarray(num);
    }
}

