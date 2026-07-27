public class  insertionSorting {
     public static void Selection(int arr[]){
        int n = arr.length ;
        for(int i=1; i<n ; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding correct position to insert
            while ( prev>=0 && arr[prev] > curr) {
                 arr[prev+1] = arr[prev];
                 prev--;
            }
            
            //insertion
            arr[prev + 1] = curr;
        }
       

        }  
    //print array function
public static void Printsort(int arr[]){
    for(int i =0; i<arr.length ;  i++){
        System.out.print(arr[i] + " " );
    }
}

    public static void main(String[] args) {
         int arr[] = {11 , 14 ,22, 25, 40, 64, 36 };
         Selection(arr);
         Printsort(arr);
    }
}
