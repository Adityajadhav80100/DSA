public class kadanes {
     public static void Kadanes(int num[] ){
        int curr_sum = num[0];
        int max_sum=Integer.MIN_VALUE;
        max_sum=num[0];
        for( int i=0; i<num.length; i++){
            // curr_sum +=num[i];
         curr_sum = Math.max(num[i], curr_sum + num[i]);
          max_sum = Math.max(curr_sum , max_sum);
        }
        System.out.println(max_sum);
     }
    public static void main(String[] args) {
        int num[] = {-2, -3, -4, -1, 2, 1, 5, -3} ;
        Kadanes(num);
    }
}
