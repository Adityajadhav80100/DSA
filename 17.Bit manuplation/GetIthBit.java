public class GetIthBit {
    public static int getIthbit(int n, int i){
        int bitMark = 1<<i;
        if((n & bitMark) == 0){
            return 0;
        }else{
            return 1 ;
        }
    }

    public static void main(String arg[]){
        System.out.println(getIthbit(10, 3));
    }
}
