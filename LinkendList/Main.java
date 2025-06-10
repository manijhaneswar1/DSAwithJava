public class Main {
    public static void main(String[] args) {
        // Single Linked List
        SinglyLL list = new SinglyLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertAt(40, 3);
        list.insertRec(1000, 4);

        list.display();
    }
}
