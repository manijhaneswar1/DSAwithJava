public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    public CircularQueue(int k) {
        capacity = k;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) return false;

        if (isEmpty()) front = 0;

        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public boolean dequeue() {
        if (isEmpty()) return false;

        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.dequeue();
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);

        for (int i = 0; i < cq.capacity; i++) {
            System.out.println(cq.front);
        }

        System.out.println("Front: " + cq.Front());
        System.out.println("Rear: " + cq.Rear());
    }
}
