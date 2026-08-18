public class Q11TilePlacing {
   public static int countWays(int n){
    // base case
    if(n==0 || n==1){
        return 1;
    }
    // recursive case
    return countWays(n-1) + countWays(n-2);
   }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to place tiles: " + countWays(n));
    }
}
