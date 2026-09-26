public class Gridways {
    public static int GridWays(int i, int j, int m, int n){
        //base case
        if(i==n-1 && j== m-1){
            return 1;
        }else if(i== n || j==m){
          return 0;
        }
        // recursion
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m); 
        return  w1 + w2;
    }
    public static void main(String  args[]){
       int n = 3;
       int m=3;
     
       System.out.println(GridWays(0,0, n, m));
    
    }
}
