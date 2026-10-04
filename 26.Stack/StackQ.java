import java.util.*;

public class StackQ {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);

    }

    // Q2 reverse a string by using stack
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }

    // Q3 reverse a stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop() + " ");
        }
        System.out.println();
    }

    // StackSpan problems
    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int currPrice = stock[i];
            while (!s.isEmpty() && currPrice >= stock[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHighIdx = s.peek();
                span[i] = i - prevHighIdx;
            }
            s.push(i);
        }

    }

    // Check the parenthesisis is balanced or not

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // Opening
            if (curr == '{' || curr == '(' || curr == '[') {
                s.push(curr);
            } else {
                // closing
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '{' && curr == '}') ||
                        (s.peek() == '(' && curr == ')') ||
                        (s.peek() == '[' && curr == ']')) {
                    s.pop();
                } else {
                    return false;
                }
            }

        }
        if (s.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    // duplicate parenthesis problem
    public static boolean duplicateParenthesis(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            // closing
            if (curr == ')') {
                int count = 0;
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;// duplicated exist
                }
            } else {
                // opening
                s.push(curr);
            }
        }
        return false; // duplicated not exist
    }

    // Max area of histogram
    public static void maxAreaHistogram(int arr[]) {
     int maxArea=0;
     int nsr[]=new int[arr.length] ;
     int nsl[]=new int[arr.length] ;

    // Next Smallest right
    Stack<Integer> s = new Stack<>() ;
    for(int i=arr.length-1; i>=0; i-- ){
        while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
            s.pop();
        }
        if(s.isEmpty()){
            nsr[i]=arr.length;
        }else{
            nsr[i]=s.peek();
        }
        s.push(i);
    }
    // Next  Smallest left

       s = new Stack<>() ;
    for(int i=0; i<=arr.length-1; i++ ){
        while (!s.isEmpty() && arr[s.peek()]>=arr[i]) {
            s.pop();
        }
        if(s.isEmpty()){
            nsl[i]=-1;
        }else{
            nsl[i]=s.peek();
        }
        s.push(i);
    }
  
    //Max area
    for(int i=0; i<arr.length-1; i++){
        int Height = arr[i];
        int width = nsr[i]-nsl[i]-1;
        int currArea= Height*width;
        maxArea=Math.max(currArea,maxArea);
    }
    System.out.println("MaxArea is : " + maxArea );

}
    public static void main(String args[]) {
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(s, 4);
        // printStack(s);
        // while (!s.isEmpty()) {
        // System.out.println(s.pop());
        // }

        // // Reverese a String using stack

        // String str="Hello";
        // String result=reverseString(str);
        // System.out.println(result);

        // // Reverese a Stack
        // Stack<Integer> s2 = new Stack<>();
        // s2.push(1);
        // s2.push(2);
        // s2.push(3);
        // //3-2-1
        // reverseStack(s2);
        // printStack(s2); // 1-2-3

        // StackSpan Problem
        int Stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[Stock.length];
        stockSpan(Stock, span);
        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }

        // Next Greater Element Problem O(n)
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> ss = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // check ss.is not empty
            while (!ss.isEmpty() && arr[ss.peek()] <= arr[i]) {
                ss.pop();
            }
            // check is ss.isempty
            if (ss.isEmpty()) {
                nextGreater[i] = -1;
            } else {

                nextGreater[i] = arr[ss.peek()];
            }
            // ss.pushh
            ss.push(i);

        }

        System.out.println("next greate:- ");

        // now print nextgreater []
        for (int i = 0; i < nextGreater.length - 1; i++) {
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        // nextgreater left
        // next smallest right
        // next smallest left

        System.out.println();

        // check valid parenthisis
        String str = "{(){}[]}";
        System.out.println(isValid(str));

        // Duplicatedd parenthis
        System.out.println();
        String str1 = "(((a+b) + c))";
        String str2 = "((a+b) +c)";
        System.out.println(duplicateParenthesis(str1));
        System.out.println(duplicateParenthesis(str2));

        // Max area of Histogram
        int arr1[] = { 2, 1, 5, 6, 2, 2,7,6,10 };
        maxAreaHistogram(arr1);        

    }

}
