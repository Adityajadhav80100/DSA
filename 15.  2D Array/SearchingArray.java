import java.util.Scanner;



public class SearchingArray {

  //Searching key in the 2D Array 
  public static boolean   Searching(int matrix[][] , int key){
      int n = matrix.length ;
         int m = matrix[0].length ;
        for(int i =0 ; i <n ; i++ ){
            for(int j =0; j<m ; j++){
             if(matrix[i][j] == key){
                System.out.println("The key is found at : (" + i + "," + j +")" );
                return true;
             }
            }
        }
        return false;
  }
    public static void main(String[] args) {
        int matrix[][] =new  int [3][3];
         Scanner sc = new Scanner(System.in);
         int n = matrix.length ;
         int m = matrix[0].length ;
        for(int i =0 ; i <n ; i++ ){
            for(int j =0; j<m ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int key = sc.nextInt();

        //ouput
         for(int i =0 ; i <n ; i++ ){
            for(int j =0; j<m ; j++){
             System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        

        Searching(matrix , key);
    }
}
