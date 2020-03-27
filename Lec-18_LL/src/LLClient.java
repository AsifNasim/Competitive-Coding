public class LLClient {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();
        //
        for (int i =1 ; i <=10; i++) {
            list.insLast(i);
        }
        list.display();
        //
        list.insFirst(22);
        list.display();
        //
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.getAtIndex(4));
        list.AddAtIndex(2,34);
        list.display();
        System.out.println(list.removeFirst());
        list.display();

        System.out.println(list.removeLast());
        list.display();
        System.out.println(list.removeAtIndex(5));
        list.display();

//        list.reverseData();
//        list.display();
        System.out.println(list.midofLL());
        list.display();
    }

}
