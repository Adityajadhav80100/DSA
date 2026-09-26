public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }


    public int removeFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        }
        if (head == tail) {
            int val = head.data;
            head = tail = null;
        } 
        int val = head.data;
            head = head.next;
            head.prev = null;
        size--;
        return val;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void  reverse(){
        Node curr= head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addLast(10);
        dll.addLast(20);
        dll.addFirst(5);
        
        dll.printList();
        dll.reverse();
        // dll.removeFirst();
        dll.printList();
    }
}