public class StackUsingArrays {
    private int [] data;
    private int top;
    public static final int DEFAULT_VALUE = 10;
    public StackUsingArrays(){
        this(DEFAULT_VALUE);
    }
    public StackUsingArrays(int capacity){
        this.data = new int[capacity];
        this.top = -1;
    }

    public int top()throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int rv = this.data[this.top];
        return rv;
    }
    public void push(int element) throws Exception {
        if(this.size()== this.data.length){
            throw new Exception("Stack is full");
        }
        this.top++;
        this.data[this.top] = element;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int remVal = this.data[this.top];
        this.data[this.top] = 0;
        this.top--;
        return remVal;
    }

    public boolean isEmpty(){
        return this.size() == 0;

    }

//    public boolean isFull(){
//        return this.size()== this.data.length;
//    }
    public int size() {
        return this.top+1;
    }

    public void display(){
        for (int i = this.top; i >= 0 ; i--) {
            System.out.print(this.data[i]+", ");
        }
        System.out.println("END");
    }

}
