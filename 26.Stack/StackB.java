import java.util.ArrayList;

public class StackB {
     static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
     }
    

    static class stack{
    // 1.  this for LinkedList implementation of stack 
        static Node head= null;

        //   1. isEmpty
        public static boolean isEmpty(){
            return head==null;
        }

        // 2. push
        public static void push(int data){
        Node newNode = new Node(data);
        if (head==null) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        // 3. pop
        public static int pop(){    
            if (isEmpty()) {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        // 4. peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }


     // 1. this for ArrayList implementation of stack

    //      static  ArrayList<Integer> List = new ArrayList<>();
        
    //    public static boolean  isEmpty(){
    //     return  List.size()==0;
    //     }
    //     //1. push
    //       public  static  void push(int data){
    //          List.add(data);
    //       }

    //     // 2.pop
    //     public  static  int pop(){
    //          int top=List.get(List.size()-1);
    //           List.remove(List.size()-1);
    //           return top;
    //     }  

    //     // 3.peek
    //     public static  int  peek(){
    //         return  List.get(List.size()-1);
    //     }
    }
    
      public static void main(String[] args) {
        stack s= new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
