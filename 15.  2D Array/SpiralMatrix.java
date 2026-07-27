public class SpiralMatrix {
    public static void Spiral(int matrix[][]){
        int n = matrix.length ;
        int m = matrix[0].length ;
        int startRow = 0 ;
        int endRow = n-1 ;
        int startCol = 0;
        int endCol = m-1;

        while (startCol<=endCol && startRow<=endRow  ) {
            //top
            for(int j=startCol ; j<=endCol ; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //right
            for(int i= startRow+1 ; i<=endRow ; i++){
                 System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
             for(int j=endCol-1 ; j>=startCol ; j--){
                if (startRow ==endRow) {//for odd no matrix
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
             
            //left 
              for(int i= endRow-1 ; i>=startCol+1 ; i--){
                if (startCol == endRow) {//for odd no matrix
                    break;
                }
                 System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10,11,12},
            {13,14,15,16}
        };

        Spiral(matrix);
    }
}
