package DoublyLL;

public class DoubleLL {

    private Node head;
    private Node tail;
    private int size;

    public DoubleLL(){
        this.size = 0;
    }

    private static class Node{
        int data;
        Node next;
        Node prev;

        private Node(int data){
            this.data = data;
        }

        private Node(int data,Node next, Node prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
        @Override
        public String toString() {
            return "Node{" + "data=" + data + '}';
        }
    }

    // InsertFirst
    public void insertFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // InsertLast
    public void inserLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertFirst(data);
        }
        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }

    // find
    public Node find(int data){
        Node node = head;
        while(node != null){
            if(node.data == data){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Insert
    public void insert(int after, int data){
        Node p = find(after);
        if( p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.next = node;
        }
    }

    // Display
    public void display(){
        Node node = head;
        Node last = null;
        while( node != null){
            System.out.print(node.data + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Printing in Reversal Order");
        while(last != null){
            System.out.print(last.data + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }
}
