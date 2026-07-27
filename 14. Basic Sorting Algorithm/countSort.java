public class countSort {
  
    public static void count(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){ //to calculate range 
           largest = Math.max(largest, arr[i]);
        }
        //counting frequency of each element 
        int count[]= new int [largest+1];
        for(int i=0; i<arr.length ; i++){
            count[arr[i]]++;
        }

        //sorting the array
        int j=0;
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {
                arr[j]=i;
                 j++;
                count[i]--;

            }
        }
    }

     public static void Printsort( int arr[]){
    for(int i =0; i<arr.length ;  i++){
        System.out.print(arr[i] + " " );
    }
}
  public static void main(String[] args) {
   int arr[]={5,9,5,2,4,2,6,3,6,7};
   count(arr);
   Printsort(arr);
  }
}
