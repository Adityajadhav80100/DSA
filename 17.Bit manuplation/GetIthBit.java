public class GetIthBit {
    public static int getIthbit(int n, int i){
        int bitMark = 1<<i;
        if((n & bitMark) == 0){
            return 0;
        }else{
            return 1 ;
        }
    }
  
    public static int SetIthbit(int n, int i){
        int bitMark = 1<<i;
        return n | bitMark ;
    }
    public static int ClearIthbit(int n, int i){
        int bitMark = ~(1<<i);
        return n & bitMark ;
    }
  
    public static int UpdateIthbit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return ClearIthbit(n, i);
        // }else{
        //     return SetIthbit(n, i);

        // }

         n= ClearIthbit(n, i);
         int bitMask = newBit<<i;
         return n | bitMask;
    }
      
    public static int ClearLastIthBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int ClearRangeIthBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static Boolean CheckPowerOfTwo(int n){
        return (n & (n-1))==0? true : false;
    }

    public static int fastexpo(int a, int n){
        int ans =1;
        while(n>0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static int CountSetBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String arg[]){
        System.out.println(ClearLastIthBits(10, 2));
        System.out.println(ClearRangeIthBits(10, 2, 4));
        System.out.println(CheckPowerOfTwo(8));
        System.out.println(CountSetBits(15));
        System.out.println(fastexpo(3, 10));
    }
}
