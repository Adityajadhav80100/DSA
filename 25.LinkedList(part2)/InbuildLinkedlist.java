import java.util.LinkedList;

public class InbuildLinkedlist {
public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // 1. Get Mid Node (Slow-Fast Pointer Approach)
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // Ensures left half gets middle node for even-sized lists

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Mid node
    }

    // 2. Merge Two Sorted Linked Lists
    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Copy remaining elements of head1
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // Copy remaining elements of head2
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next; // Return head skipping dummy node
    }

    // 3. MergeSort Main Function
    public Node mergeSort(Node head) {
        // Base case: 0 or 1 node
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node mid = getMid(head);

        // Split into left & right halves
        Node rightHead = mid.next;
        mid.next = null; // Disconnect left and right halves

        // Sort both halves recursively
        Node newLeft = mergeSort(head);     // FIX: Pass head (start of left half)
        Node newRight = mergeSort(rightHead); // Pass rightHead (start of right half)

        // Merge sorted halves
        return merge(newLeft, newRight);
    }

    // Utility Method to Add Elements
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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

    // Utility Method to Print List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


//  zig zag linked list 
public void zigZag(){
    // find mid
    Node slow=head;
    Node fast=head.next;
    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next;
    }
    Node mid= slow;

    // Reverse  2nd half
       Node curr=mid.next;
       mid.next=null;
       Node prev=null;
       Node next;
       while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
       }
    
       Node left = head;
       Node right = prev;
       Node nextL; Node nextR;
    //    Alte merge  zig zag merge

       while (left!=null&& right!= null) {
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        // updation
        left=nextL;
        right=nextR;
       }
    //    
}



    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
       
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); // Output: [1, 2, 3]

        list.removeFirst();
        System.out.println(list); // Output: [2, 3]

        list.removeLast();
        System.out.println(list); // Output: [2]


        InbuildLinkedlist ll = new InbuildLinkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);


        // System.out.print("Original List: ");
        // ll.printList(); // 4 -> 3 -> 2 -> 1 -> null

        // ll.head = ll.mergeSort(ll.head);

        // System.out.print("Sorted List:   ");
        // ll.printList(); // 1 -> 2 -> 3 -> 4 -> null

        ll.printList();
        ll.zigZag();
        ll.printList();
    }
}
