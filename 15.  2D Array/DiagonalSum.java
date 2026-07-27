public class DiagonalSum {
    public static void Diagonal(int matrix[][]){
        int sum= 0;
        // //time complexcity is o(n^2)
        // for(int i=0; i<matrix.length ; i++){
        //     for(int j = 0; j<matrix[0].length; j++){
        //         //primary top
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }else if (i+j==matrix.length-1) { //second top 
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }

        //More optimize  Time complexcity O(n)
       for(int i=0; i<matrix.length ; i++){
       //pd    
        sum+=matrix[i][i];
        //sd
        if (i !=matrix.length-1-i)  //but this condition is for not sum common diagonal element return it should one time onlyk
            sum+=matrix[i][matrix.length-1-i];
       }

        System.out.println(sum);

       
        
    }
   public static void main(String[] args) {
        int matrix[][]={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10,11,12},
            {13,14,15,16}
        };

        Diagonal(matrix);
    }   
}
