import java.util.* ;

public class Q2_GetShortestPath {
 
    public static float GetShortestPath(String str){
        int x=0; int y=0;
        for(int i=0 ; i<str.length(); i++){
            char dir = str.charAt(i);
            if(dir=='N'){
                y++;
            }else if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else if(dir=='W'){
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }

    public static void main(String[] args) {
       String str = "WNEENESENNN" ;
       System.out.println(GetShortestPath(str));
    }
}

