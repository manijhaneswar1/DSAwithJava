public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;

    public SinglyLL(){
        this.size = 0;
    }

    private static class Node{
        private final int data;
        private Node next;

        private Node (int data){
            this.data = data;
        }

        private Node (int data, Node next){
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + '}';
        }
    }
    // Insertion with recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if( index == 0){
            Node temp = new Node(val);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }
    // Insertion at First
    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = newNode;
        }
        size++;
    }
    // Insertion at Last
    public void insertLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            insertFirst(data);
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    // Insertion at Particular Position
    public void insertAt(int data, int position){
        if(position == 0){
           insertFirst(data);
        }else if(position == size){
            insertLast(data);
        }else{
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(data, temp.next);
            temp.next = newNode;
            size++;
        }
    }

    // Deletion First
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
        }else{
            head = head.next;
        }
    }
    // Deletion Last
    public void deleteLast(){
        if (head == null){
            System.out.println("List is empty");
        }else if(head.next == null){
            deleteFirst();
        }else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }
    }
    // Deletion at a particular Position
    public void deleteAt(int position){
        if( position < 0 || position >= size){
            System.out.println("Invalid Position");
            return;
        }
        if(position == 0){
            head = head.next;
            if( head == null) {
                tail = null;
            }
        }else{
            Node temp = head;
            for(int i = 0; i < position - 1; i++){
                temp = temp.next;
            }
            Node toDelete = temp.next;
            temp.next = toDelete.next;
            if( toDelete == tail){
                tail = temp;
            }
            size--;
        }
    }

    // Get a Node
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

}
