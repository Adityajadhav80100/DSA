public class SelectionSort {

    public static void selection(int arr[]){
        int n = arr.length ;
        for(int i = 0 ; i<n-1 ; i++ ){
            int minpos = i;
            for(int j=i+1 ; j<n; j++ ){
                if (arr[j]<arr[minpos]) {
                    minpos= j; 
                }
            }
            int temp = arr[minpos];
             arr[minpos] = arr[i];
             arr[i] = temp;

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
         selection(arr);
         Printsort(arr);
    }
}

