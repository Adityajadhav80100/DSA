public class LinkedList {
    public static class Node {
        int data;
        Node next;

     public  Node( int data){
        this.data= data;
        this.next=null;
     }
    }

    public static Node head;
    public static Node tail;
    public  static  int size;

//    check is linkedlist is  cicyle or loop 
  public static  boolean  isCycle(){   //floyd cycle finding algorithm
         Node slow = head;
         Node fast = head;
         while (fast!=null && fast.next!=null) {
             slow=slow.next; //+1
             fast=fast.next.next; //+2 
            
             if (slow==fast) {
                 return true;    //cycle exist 
             }
         }
         return false;  //cycle doent exist

  }


 public static void removeCycle(){
    // 1 find cycle exist or not
     Node slow = head;
         Node fast = head;
        Boolean iscycle=false;
         while (fast!=null && fast.next!=null) {
             slow=slow.next; //+1
             fast=fast.next.next; //+2 
            
             if (slow==fast) {
                 iscycle=true;
                    //cycle exist 
                    break;
             }
         }
         // If no cycle exists, do nothing
        if (!iscycle) {
            return;
        }
         
        //2.  find  slow and fast meeting again or not 
        slow=head;
        Node prev=null;
         while (slow!=fast) {
            prev=fast;
             slow=slow.next;
             fast=fast.next;
         }
         // 3.remove cycle
         prev.next=null;
 }

     public static void main(String arg[]) {
       head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        temp.next = new Node(3);
        
        // Link 3 back to 2 (1 -> 2 -> 3 -> 2 ...)
        temp.next.next = temp;

        // head.next.next.next= head;
      System.out.println(isCycle());
      removeCycle();
      System.out.println(isCycle());

    }
}
