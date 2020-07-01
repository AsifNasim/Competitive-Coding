public class LinkedList {
    private Node head;
    private Node tail;
    public int size = 0;



    public class Node {
        int value;
        Node next;

        public Node(int value) {

            this.value = value;
        }

        public Node() {

        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        if(size == 0){
            insertFirst(value);
            return;
        }
        Node temp = head;
        while(temp != null) {
            Node node = new Node(value);
            tail.next = node;
            tail = node;

            size++;
        }

    }
    public int deleteFirst(){
        if(size == 0){
            System.out.println("Empty list");
            return  -1;
        }
        int temp = head.value;
        head= head.next;
        size--;
        return temp;
    }

//    public Node delete(){
//        if(size == 0){
//            deleteFirst();
//        }
//        Node temp = head;
//        while (temp.next != tail){
//            temp= temp.next;
//        }
//        tail = temp;
//        temp.next = null;
//        size--;
//        return temp;
//    }
    public int delete(){

        if(size == 0){
            deleteFirst();
        }

        Node temp = head;

        while (temp.next != tail){
            temp= temp.next;
        }

        int val = tail.value;
        tail = temp;
        temp.next = null;
        size--;
        return val;
    }

    public void deleteContiguous(){
        Node temp = head;

        while (temp.next != null){
            int t1 = temp.value;
            int t2 = temp.next.value;
            if(t1 == t2){
                temp.next =temp.next.next;
                size--;
            }
            else{
                temp = temp.next;
 
            }
        }
        tail = temp;
    }


    public Node getNode(int index){
        Node temp = head;
        int i =0;
        while(i != index){
            temp = temp.next;
            i++;
        }
        return temp;
    }
    public void insertBetween(int index, int value){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node prev = getNode(index -1);
        Node node = new Node(value);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public int deleteAtIndex(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return delete();
        }
        Node prev = getNode(index -1);
        int temp = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return temp;
    }

    public Node returnNode(int value){
        Node temp = head;
        while(temp.next != null){
            if(temp.value == value){
                return temp;
            }
        }
        return null;
    }

    public void reverseList(){
        reverseList(head);
    }

    private void reverseList(Node list){
        if(list == tail){
            head = tail;
            return ;
        }

        reverseList(list.next);
        tail.next = list;
        tail = list;
        tail.next = null;



    }

    public LinkedList mergeLinkedList(LinkedList node1, LinkedList node2){
        Node first = node1.head;
        Node second = node2.head;
        LinkedList newNode = new LinkedList();
        while(first != null && second != null){
            if(first.value < second.value){
                newNode.insertLast(first.value);
            }
            else {
                newNode.insertLast(second.value);
            }

        }

        while(first != null){
            newNode.insertLast(first.value);
            first = first.next;
        }
        while (second != null){
            newNode.insertLast(second.value);
            second = second.next;
        }

        return newNode;
    }
    public Node mid(){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next!= null){
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public LinkedList mergeSort(LinkedList lists){
        if(lists.size == 1){
            return lists;
        }

        Node mid = lists.mid();
        LinkedList first = new LinkedList();
        first.head = lists.head;
        first.tail = mid;
        first.size = (lists.size+1)/2;

        LinkedList second = new LinkedList();
        second.head= mid.next;
        second.tail = lists.tail;
        second.size = lists.size/2;
        mid.next = null;
        first = mergeSort(first);
        second = mergeSort(second);

        return  mergeLinkedList(first, second);



    }

    public int kthFromLast(int k){
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow.value;
    }

    public LinkedList OddEven(LinkedList list){
        LinkedList Odd = new LinkedList();
        LinkedList Even = new LinkedList();
        Node temp = head;
        while (temp!= null){
            if(temp.value%2 != 0){
                Odd.insertLast(temp.value);

            }
            else{
                Odd.insertLast(temp.value);
            }
            temp = temp.next;
        }
        Odd.tail.next = Even.head;
        Odd.tail = Even.tail;
        return Odd;
    }

    public void  OddEvenBetter(){
    Node odd_head = null;
    Node odd_tail = null;
    Node even_head = null;
    Node even_tail = null;
    Node temp = head;
    while(temp != null){
        if(temp.value%2 != 0){
            if(odd_head == null){
                odd_head = temp;
                odd_tail = temp;
            }
            else{
                odd_tail.next = temp;
                odd_tail = temp;
            }
        }
        else{
            if(even_head == null){
                even_head = temp;
                even_tail = temp;
            }
            else{
                even_tail.next = temp;
                even_tail = temp;
            }
        }
        temp = temp.next;
    }
        odd_tail.next = even_head;
        head = odd_head;
        tail = even_tail;
        tail.next= null;

    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
