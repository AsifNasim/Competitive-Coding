import java.util.Scanner;

public class QueueClient {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        QueueUsingArrays queue = new QueueUsingArrays(20);
        for (int i = 0; i <20 ; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.dequeue()+" ");
        }
    }
}
