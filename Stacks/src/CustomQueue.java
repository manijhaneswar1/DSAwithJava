public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean enqueue(int item){
        if(isFull()){
            System.out.println("Queue is Full !");
        }
        data[end++] = item;
        return true;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty !");
        }
        int removed = data[0];

        // shift elements to left
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }

        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty !");
        }
        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("END");
    }

    private boolean isFull(){
        return end == data.length - 1;
    }

    private boolean isEmpty(){
        return end == -1;
    }
}
