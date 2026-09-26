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

    // method to add element in linked list
    public void addFirst(int data){
        // step1:- create new node
        Node newNode = new Node(data);
        size++;
        // Check is there any node exist
        if (head == null) {
            head=tail=newNode;
            return ;
        }
        // step2:- link the old node to new node
        newNode.next=head;
        // step3:- now asigned the head to new node
        head= newNode;
        
    }  
    // Method to add element to last node
    public  void  addLast(int data){
        // step1:- create new node
        Node newNode = new Node(data);
        size++;
           // Check is there any node exist
        if (head == null) {
            head=tail=newNode;
            return ;
        }
        // step2:- link the old node  tail's next  to new node
        tail.next =newNode;
        // step3:- now asigned the tail to new node
        tail=newNode;          
    }


    // print a Linkedlist
    public void print(){
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + "--> ");
            temp=temp.next;
        }
        System.out.println("null" + "  Size of Linkedlist:- " + size);
    }


    // now Add new node in middle
    public  void Add(int idx, int data){
      
      if (idx==0) {
        addFirst(data);
      }


        Node newNode=new Node(data);
        size++;
        Node  temp= head;
        int i=0;
        
        while (i < idx-1) {
            temp=temp.next; 
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }

    // Removing first node
    public  int removingFirst(){
        if(size == 0){
             System.out.println("LL is empty");
           return Integer.MIN_VALUE;
         }else if (size==1) {
            int val = head.data;
            head=tail=null;
                size=0;
            return val;
        }
        int val= head.data;
        head=head.next;
        size--;
        return val;

    }

    // Removing Last 
    public  int removingLast(){
        if(size == 0){
             System.out.println("LL is empty");
           return Integer.MIN_VALUE;
         }else if (size==1) {
            int val = head.data;
            head=tail=null;
                size=0;
            return val;
        }
        Node prev = head;
        // Finding prev 
        for(int i=0; i<size-2; i++){
            prev=prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;

    }

    // Search key  in Linked List
    public int search(int key){
        Node temp = head;
        int i=0;
        while (temp!= null) {
            if (temp.data == key) {
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


    // Search key in Linkedlist by using recursiion]
    public int helper(Node head,int key){
        // base case
        if(head ==null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = helper(head.next, key);
         if(idx==-1){
            return -1;
         }
         return idx+1;
    }

    public  int recSearch(int key){
        return  helper(head,key);
    }


// Reverse a linked list (iterative approach)
 public  void itrReverse(){
    Node prev=null;
    Node curr = head;
    Node Next;
  
    while(curr!=null){
        Next= curr.next;
        curr.next=prev;
        prev=curr;
        curr=Next;
    }
    head=prev;

 }


//  Removing nth node from the end
public void removeNthFromEnd(int n) {
    // calculate size
    int sz =0;
    Node temp = head;
    while(temp!=null){
        temp=temp.next;
        sz++;
    }
    if(sz==n){
        head=head.next;
        return;
    }
// finding prev node
    int i=1;
    int iToFind = sz-n;
    Node prev = head;
    while(i<iToFind){
        prev=prev.next;
        i++;
    }
    //now removing nth node
    prev.next= prev.next.next;
    return;

}
  

//finding mid node of linked list

 public Node findMid(Node head){ //helper
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;

 }

//  now finding is Linkedlist is palindrome or not
public boolean isPalindrome(){
    // base case
    if(head==null || head.next == null){
        return true;
    }   
    // step1:- find mid
    Node midNode = findMid(head);   
    // step2:- reverse 2nd half
    Node prev=null;
    Node curr=midNode;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    // step3:- compare the two halves
    Node left = head;
    Node right = prev;
    while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }
    return true;
}

    public static void main(String arg[]) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(2);
        // ll.addLast(1);
        // // ll.Add(2, 5);
    
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        // ll.addFirst(1);

    // //     ll.print();
    // //    ll.removingFirst();
    // //    ll.print();
    // //    ll.removingLast();
    //    ll.print();
    // //    System.out.println("Index of 5: " + ll.search(5));   
    // //    System.out.println(ll.recSearch(4));
    // //    System.out.println(ll.recSearch(6));

    // //   ll.itrReverse();  
    // //   ll.print();

    // ll.removeNthFromEnd(3);
    // ll.print();

    
    System.out.println(ll.isPalindrome());
    
  
}


}
