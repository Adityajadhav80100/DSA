public class Q14BinaryString { 
  
    public static void NonConsecutiveBinaryStrings(int n, String str, int lastDigit){
        // base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // recursive case
        NonConsecutiveBinaryStrings(n-1, str + "0", 0);
        if(lastDigit == 0){
            NonConsecutiveBinaryStrings(n-1, str + "1", 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        NonConsecutiveBinaryStrings(n, "", 0);
    }

}