/**
 * Q1PrintNumber
 */
public class Q1PrintNumber {

    // increasing order 
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    // Decreasing order
     public static void PrintDec(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
     
    
    }


    // Factorial of a number
   public static int Factorial(int n){
    if(n==0){
        return 1;
    }
    int fact= n*Factorial(n-1);
        return fact;
   } 

   public static int Sum(int n){
    if(n==1){
        return 1;
    }
    int sum = n+ Sum(n-1);
    return sum;
}

//   Fibonacci series
       public static int Fib(int n ){
        if(n==1 || n ==0){
            return n;
        }
        int Fnm = Fib(n-1); 
        int Fnm2 = Fib(n-2);
        int Fn = Fnm + Fnm2; 
        return Fn;
       }
 

    //    IsSortedd array
    public static boolean IsSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr, i+1);
    }

//   first occurence of an element in an array
    public static int FirstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FirstOccurence(arr, key, i+1);
    }


//   Last Occurence of an element in an array
  public static int LastOccurence(int arr[], int key, int i){ 
    if(i==arr.length){
        return -1;
    }
    int isFound = LastOccurence(arr, key, i+1);
    if(isFound ==-1 && arr[i]==key){
        return i;
    }
    return isFound;
  }


//    return x^n 
 public static int Power(int x, int n ){  //O(n) time complexity
    if(n==0){
        return 1;
    }
    // int xnm1 = Power(x, n-1);
    // int xn = x * xnm1;
    // return xn;

    return x * Power(x, n-1);
 }

//  find power of x^n in O(log(n)) time complexity
 public static int PowerOptimized(int x, int n){
    if(n==0){
        return 1;
    }
    int halfPower = PowerOptimized(x, n/2);
    int halfPowerSq = halfPower * halfPower;
    if(n%2!=0){
        halfPowerSq = x * halfPowerSq;
    }
    return halfPowerSq;
 }


    public static void main(String arg []){
    //   int n= 25;
    //   PrintDec(n);
    //   PrintInc(n);
        
    //   System.out.println(Factorial(n));
    //   System.out.println(Sum(n));
    //   System.out.println(Fib(n));
    
    int arr[] = {1, 2, 3, 4, 5, 8 , 6 , 9 , 5};

//    System.out.print( IsSorted(arr , 0));
    
   System.out.println(FirstOccurence(arr, 15, 0));
   System.out.println(LastOccurence(arr, 5, 0));
   System.out.println(Power(2, 10));

   System.out.println(PowerOptimized(2, 5));

}

}