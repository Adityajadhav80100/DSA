
import  java.util.*;
import java.util.LinkedList;

public class QueueL {
   static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static class Queuel{
        static Node head = null;
        static Node tail = null;

        // isEmpty
        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add (Enqueue)
        public static void add(int data) {
             Node newNode = new Node(data);
   
             if(isEmpty()){
                head = tail = newNode;
                return;
             }
             tail.next=newNode;
             tail=newNode;
  
        }
       

        // remove (Dequeue)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = head.data;
    
            if(tail==head){
              head=tail=null; 
            }else{
                head=head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // System.out.println(q.remove());  // q.remove();
        // q.add(4);
        // // q.remove();
        // System.out.println(q.remove());  // q.remove();
        // q.add(5);
        // System.out.println(q.remove());  // q.remove();
        // // q.remove();
        // // q.add(4);
        // // q.remove();


  
       // Using Java Collection Framework's Queue interface
       Queue<Integer> q = new LinkedList<>();

       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
