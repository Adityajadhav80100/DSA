public class QuickSort {
      // Print arr
    public static void PrintArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    //Quick Sort
    public static void QuickSortArry(int arr[], int si, int ei){
        // bass case
        if(si>=ei){
            return;
        }
        // Find pivot index
        int pidx = Partition(arr, si, ei);
        // Left side
        QuickSortArry(arr, si, pidx-1);
        // Right side
        QuickSortArry(arr, pidx+1, ei);
    }

    // Partition
    public static int Partition(int arr[], int si, int ei){
     
        // pivot element
        int pivot = arr[ei];
        // index for samller element 
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Place pivot in its correct position
        i++;
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String[] args) {
          int arr[] = {6,3,9,5,2,8};
          System.out.println("Original array:");
          PrintArr(arr);
          QuickSortArry(arr, 0, arr.length-1);
          System.out.println("\nSorted array:");
          PrintArr(arr);
    }
}
