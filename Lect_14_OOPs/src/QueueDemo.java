//import java.util.Scanner;
//import java.util.Arrays;
//public class QueueDemo {
//    static Scanner s = new Scanner(System.in);
//    public int [] data;
//    private int index;
//    private int DEFAULT_SIZE = 10;
//
//    public QueueDemo(){
//        this.data = new int[DEFAULT_SIZE];
//        this.index = 0;
//    }
//    public void push(int index){
//        if(isFull()){
//
//        }
//        data[++index] = value;
//    }
//    public int pop(){
//        int temp = data[0];
//        for (int i = 1; i <data.length ; i++) {
//            data[i-1] = data[i];
//        }
//        index--;
//        return temp;
//
//    }
//
//    public int front(){
//        return data[0];
//    }
//
//    private boolean isFull(){
//        return index = data.length;
//    }
//
//}
