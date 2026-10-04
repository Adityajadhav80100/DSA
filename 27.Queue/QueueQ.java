import java.util.*;
import java.util.LinkedList;

public class QueueQ {

    // Q6 Reverse a Queue using Stack
    public static void reversQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        System.out.println();
    }

    // Q5. Interleave two halves of a Queue.
    public static void interleaveTwohalves(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove());
        }
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

    }

    // Q4.first non repeting letter in stream of characcter
    public static void firstNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char chh = str.charAt(i);
            q.add(chh);
            freq[chh - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }

        System.out.println();
    }

    // //Q1. Queue using 2 Stack 1.push method , 2.pop method

    // static class Queue{

    // static Stack<Integer> s1=new Stack<>();
    // static Stack<Integer> s2=new Stack<>();

    // public static boolean isEmpty(){
    // return s1.isEmpty();
    // }

    // // add O(n)
    // public static void add(int data){
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }

    // s1.push(data);

    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }

    // // Remove O(1)
    // public static int remove(){
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // return s1.pop();

    // }
    // //peek O(1)
    // public static int peek(){
    // if (isEmpty()) {
    // System.out.println("Queue is empty");
    // return -1;
    // }
    // return s1.peek();
    // }

    // }

    // // Q2. stack using 2 queues 1.push method 2.pop method
    // static class Stack {
    // static Queue<Integer> q1 = new LinkedList<>();
    // static Queue<Integer> q2 = new LinkedList<>();

    // // isEmpty
    // public static boolean isEmpty() {
    // return q1.isEmpty() && q2.isEmpty();

    // }

    // // add
    // public static void push(int data) {
    // if (!q1.isEmpty()) {
    // q1.add(data);

    // } else {
    // q2.add(data);
    // }
    // }

    // // remove O(n)
    // public static int pop() {
    // if (isEmpty()) {
    // System.out.println("Stack is Empty");
    // return -1;
    // }
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {

    // top = q1.remove();
    // if (q1.isEmpty()) {
    // break;
    // }
    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();
    // if (q2.isEmpty()) {
    // break;
    // }
    // q2.add(top);
    // }
    // }
    // return top;
    // }

    // // peek O(1)
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("Stack is empty");
    // return -1;
    // }
    // int top = -1;
    // if (!q1.isEmpty()) {
    // while (!q1.isEmpty()) {

    // top = q1.remove();

    // q2.add(top);
    // }
    // } else {
    // while (!q2.isEmpty()) {
    // top = q2.remove();

    // q1.add(top);
    // }
    // }
    // return top;
    // }

    // }

    public static void main(String[] args) {
        // Queue q= new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(4);
        // q.add(4);

        // while (!q.isEmpty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }

        // Q2. stack using 2 queues 1.push method 2.pop method

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();

        }
        // Q4.first non repeting letter in stream of characcter

        String str = "aabccxb";
        firstNonRepeating(str);

        // Q5. Interleave two halves of a Queue.
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleaveTwohalves(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

        Queue<Integer> q2 = new LinkedList<>();
        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        reversQueue(q2);
        while (!q2.isEmpty()) {
            System.out.print(q2.peek() + " ");
            q2.remove();
        }
    }

}
