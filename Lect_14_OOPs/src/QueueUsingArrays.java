public class QueueUsingArrays {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArrays() {
        this.data = new int[10];
        this.front = -1;
        this.rear =-1;
        this.size = 0;
    }

    public QueueUsingArrays(int capacity) {
        this.data = new int[capacity];
        this.front = -1;
        this.rear =-1;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
                           return (size == 0);
    }
    public int front() throws Exception {
        if(size == 0){
            throw new Exception("Empty Queue");
        }
        return this.data[front];
    }

    public void enqueue(int element) throws Exception {
        if(size == this.data.length){
            throw new Exception("Queue Full Exception");
        }

        if(size == 0){
            front = 0;
        }
        size++;
        rear = (rear+1)%data.length;
        data[rear] = element;
    }

    public int  dequeue() throws Exception {
        if(size == 0){
            throw new Exception("Queue Empty Exception");
        }
        int retVal = this.data[front];
        front = (front+1)%this.data.length;
        size--;
        if(size == 0){
            front = -1;
            rear = -1;
        }
        return retVal;

    }
}
