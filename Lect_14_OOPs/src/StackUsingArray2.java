public class StackUsingArray2 {
    private int [] data;
    private int top;

    public StackUsingArray2(){
        data = new int[10];
        top = -1;
    }

    public StackUsingArray2(int capacity){
        data = new int[capacity];
        int top = -1;
    }

    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return size()== data.length;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int elem) throws stackfullException {
        if(size() == data.length){
//            throw new stackfullException();
            doubleCapacity();
        }
        top++;
        data[top] = elem;
    }

    private void doubleCapacity() {
        int [] temp = data;
        data = new int[2*temp.length];
        for (int i = 0; i <= top ; i++) {
            data[i] = temp[i];
        }
    }

    public int pop() throws stackEmptyException {
        if(size()== 0){
            throw new stackEmptyException();
        }
        int temp = data[top];
        top--;
        return temp;
    }
    public int top() throws stackEmptyException {
        if(size() == 0){
            throw new stackEmptyException();
        }
        return data[top];
    }
    public void display2(){
        for (int i = top; i >= 0 ; i--) {
            System.out.print(data[i]+", ");
        }
        System.out.println("END");
    }
}

class stackEmptyException extends Exception{

}

class stackfullException extends Exception{

}