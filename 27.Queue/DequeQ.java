import  java.util.*;
import java.util.LinkedList;
public class DequeQ {
     //Q.7 Stack and Queue using Deque

     static class Queue{
         Deque<Integer> d = new LinkedList<>();
        //  add
        public  void add(int data){
            d.addLast(data);
        }
        //  remove
        public  int remove(){
            return  d.removeFirst();
        }
        //  peek
        public int peek(){
            return d.getFirst();
        }
        // isEmpty
        public  boolean isEmpty(){
            return d.isEmpty();
        }
     }

    static class Stack{
        Deque<Integer> d = new LinkedList<>();
        // push O(1)
        public  void push(int data){
            d.addLast(data);
        }
        // pop O(1)
        public  int pop(){
            return d.removeLast();
        }
        // peek O( 1)
        public   int peek(){
            return d.getLast();
        }
    }
    public static void main(String[] args) {
    
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addFirst(5);
        deque.addFirst(6);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);


        System.out.println("first el :- " + deque.getFirst());
        System.out.println("last el :- " + deque.getLast());



// Testing custom Stack class
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("peek = " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());       
        
        

        // Queue
      // Testing Custom Queue Class
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek()); // Outputs: 1
        System.out.println(q.remove());           // Outputs: 1
        System.out.println(q.remove());           // Outputs: 2
        System.out.println(q.remove());
        
    }
}
