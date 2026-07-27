public class pairTheArray {
    public static void Pair(int num[]){
        //pairs
        int Total_pairs = 0;
        for(int i = 0; i<num.length ; i++ ){
            int curr = num[i];
            for(int j=i+1; j < num.length ; j++){
                System.out.print("(" + curr + "," + num[j] + ") ");
               Total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total no of pairs :" + Total_pairs);
    }
    public static void main(String[] args) {
         int num[]= {2, 4, 6, 8, 9, 10, 12, 14,16 };
         Pair(num);
    }
}
