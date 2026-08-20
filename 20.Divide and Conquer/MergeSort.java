public class MergeSort {
  
    // Print arr
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Merge Sort 
    public static void MergeSortArry(int arr[], int si , int ei){
        // base case
        if(si>=ei){
            return;
        }
        // Find mid 
        int mid = si + (ei - si)/2;

        //  Divide
        MergeSortArry(arr, si, mid);
        MergeSortArry(arr, mid+1, ei);
        // Temp copy
        Merge(arr , si , mid , ei);

    }

    // Sorting and copying arry int temp
    public static void Merge(int arr[], int si , int mid, int ei){
        // Temp size should be ei-si+1
        int Temp[]= new int[ei-si+1];
        int i = si ;
        int j = mid+1;
        int k =0;
        
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                Temp[k]= arr[i];
                i++; 
            }else{
                Temp[k] = arr[j];
                j++;
            }
            k++;
          
        }
          
            // remaining left or right side into temp
            // left
            while(i<=mid){
                Temp[k++]= arr[i++];
                
            }
            // Right 
            while(j<=ei){
                Temp[k++] = arr[j++];
            }

            // Copy temp into original arr
            for(k=0, i=si; k<Temp.length; k++, i++){
                arr[i] = Temp[k];
            }
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        System.out.println("Original Array:");
        PrintArr(arr);
        MergeSortArry(arr, 0, arr.length-1);
        System.out.println("\nSorted Array:");
        PrintArr(arr);

    }
}
