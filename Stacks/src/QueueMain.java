public class QueueMain {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);

        q.display();

        System.out.println("Removed Item :- "+q.dequeue());

        q.display();
    }
}
