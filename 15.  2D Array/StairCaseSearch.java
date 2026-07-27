public class StairCaseSearch {
    public static boolean SortMatrixSearch(int matrix[][] , int Key){
         int row = 0 ;
         int col = matrix[0].length - 1 ; 

         
         while (row < matrix.length  && col>=0) {
             if (matrix[row][col]==Key) {
               System.out.println("key found at :  " + row + "," + col);
                return true;
             }else if ( Key < matrix[row][col] ) {
                  col-- ;
             } else {
                row++ ;
             }

            }
            System.out.println(" key is not found");
            return false ; 
        }
    public static void main(String[] args) {
        int matrix[][]={
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int Key = 50;

        SortMatrixSearch(matrix , Key);

       
    }
}
