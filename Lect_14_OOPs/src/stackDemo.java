import java.util.Scanner;
public class stackDemo {
    private  int[] data;
    private int top;
    private int DEFAULT_SIZE = 10;
    static Scanner s = new Scanner(System.in);
    public stackDemo() { // constructor is used for initialization of instances
        this.data = new int[DEFAULT_SIZE];
        this.top = -1;
    }

    public void push(int element) throws isFullException {
        if (isFull()) {
            throw new isFullException();
        }
        data[++top] = element;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new isEmptyException();
        }
        int temp = data[top];
        top--;
        return temp;
    }

    public boolean isFull() {
        return top == data.length - 1;

    }

    private boolean isEmpty() {
        return top == -1;
    }
}

class isEmptyException extends Exception{

}

class isFullException extends  Exception{

}


