public class HeapClient {
    public static void main(String[] args) throws Exception {
        Heaps heap = new Heaps();
        heap.insert(12);
        heap.insert(2);
        heap.insert(1);
        for (int i = 0; i < 3; i++) {
            System.out.println(heap.remove());
        }
        heap.display();
    }

}
