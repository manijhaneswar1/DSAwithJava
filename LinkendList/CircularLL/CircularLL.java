package CircularLL;

public class CircularLL {
    private Node head;
    private Node tail;
    int size;

    CircularLL(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // Insert
    public void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    // Display
    public void display(){
        Node node = head;

        if( head != null){
            do{
                System.out.print(node.data + " -> ");
                node = node.next;
            }while ( node != head);
        }
    }
    // Delete
    public void delete(int data){
        Node node = head;
        if( node == null){
            return;
        }
        if(node.data == data){
            head = head.next;
            tail.next = head;
            return;
        }

        do{
            Node n = node.next;
            if(n.data == data){
                node.next = n.next;
                break;
            }
            node = node.next;
        }while (node != head);
    }
}
