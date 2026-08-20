public class SearchInRoatedArray {
   
    public static int Search(int arr[], int si , int ei, int tar ){
        // base case
        if(si>ei){
            return -1;
        }
        // Find mid
        int mid = si + (ei-si)/2;
        // Case found
        if(arr[mid]==tar){
            return mid;
        }

        // mid on left side
        if(arr[si]<= arr[mid]){
            // case a : left side 
            if(arr[si]<=tar && tar<=arr[mid]){
                return Search(arr, si, mid-1, tar);
            }
            // case b : right side
            else{
                return Search(arr, mid+1, ei, tar);
            }
        }
        // mid on right side
        else{
            // case a : right side
            if(arr[mid]<=tar && tar<=arr[ei]){
                return Search(arr, mid+1, ei, tar);
            }
            // case b : left side
            else{
                return Search(arr, si, mid-1, tar);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 2;
        System.out.print(Search(arr, 0, arr.length-1, tar));
        
    }
}
