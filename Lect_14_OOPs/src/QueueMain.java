public class QueueMain {
    public static void main(String[] args) {
        CircularQueue que = new CircularQueue();
        for (int i = 0; i <=5 ; i++) {
            que.insert(i);
        }

        System.out.println(que.remove());

        que.insert(8);
        System.out.println(que.remove());

    }
}
