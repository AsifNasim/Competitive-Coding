public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        for (int i = 1; i <10 ; i++) {
//            list.insertFirst(i);
//        }
//
//        list.display();
//        for (int i = 1; i <=10; i++) {
//            list.insertLast(i);
//        }
//        list.display();
//
//        System.out.print(list.deleteFirst());
//        System.out.println(list.size);
//        System.out.println(list.delete());
//        list.insertrBetween(17,34);
//        list.display();
//        System.out.println(list.deleteAtIndex(3));
//        list.display();
    list.insertFirst(9);
    list.insertFirst(3);
    list.insertFirst(5);
    list.insertFirst(6);
    list.insertFirst(1);
//    list.deleteContiguous();
    list.display();
//        System.out.println(list.mid());
//    list.reverseList();
        list.mergeSort(list);
        list.display();
    }


}
