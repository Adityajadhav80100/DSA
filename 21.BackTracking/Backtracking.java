public class Backtracking {
   
    // Backtrackign on Array 
    public static void ChangeArr(int arr[] , int i , int val ){
           //base case
           if(i==arr.length){
                printArr(arr);
                return;
           }
           //recursion 
           arr[i] = val;
           ChangeArr(arr, i+1, val+1);
           arr[i] = arr[i] - 2; // backtracking step

     }

     public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
     }



    // Find Subsets
    public static void FindSubsets(String str , String ans, int i ){
        // base case 
        if(i == str.length()){
           
           if(ans.length() == 0){
                System.out.println("null");
              }
            else{

                System.out.println(ans);
            }
            return ;

        }

        //recursion
        // yes choice
        FindSubsets(str , ans+str.charAt(i), i+1);
        //No choice`
        FindSubsets(str , ans, i+1);
    }     


    // Permutations (Arrangements ) 
    public static void FindPermutations(String str , String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        } 
        // recursion
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            FindPermutations(newStr, ans+curr);
        }
    }


    public static void main(String[] args) {
        // int arr[] = new int[5];
        // ChangeArr(arr, 0, 1);
        // printArr(arr);

        String str = "abc" ;
        FindSubsets(str,"",0);
        FindPermutations(str,"");

    }
}
