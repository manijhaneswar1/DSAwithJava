package DoublyLL;

public class Main {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.inserLast(100);
        list.inserLast(10000);
       // list.insert(100, 200);
        list.display();
    }
}
