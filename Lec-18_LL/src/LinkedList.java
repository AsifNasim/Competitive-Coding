import java.util.Scanner;

public class LinkedList {
    static Scanner s = new Scanner(System.in);
    private Node head;
    private Node tail;
    private int size;

    public class Node{
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }

    }


    // Mid point of linkedList
    public int midofLL(){
        Node slow = head;
        Node fast = head;
        while (fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }



   // Reverse Pointer
    public void reversePointer(){

    }
   // Reverse data
    public void reverseData() throws Exception {
        while (head != tail){

        }
//       int left = getAtIndex(0);
//       int right = getAtIndex(size-1);
//       while (left < right){
//           int temp = left;
//           left = right;
//           right = temp;
//
//           left++;
//           right--;
//       }
        }

    // Remove at Index
    public int removeAtIndex(int index) throws Exception {

        if(index < 0 || index > size){
            throw new Exception("invalid index");
        }

        if(size == 1){
            return removeFirst();
        }

        int retVal = getAtIndex(index);
        Node prev = getAtNode(index-1);
        prev.next = prev.next.next;
        size--;

        return retVal;
    }

    //Remove Last
    public int removeLast() throws Exception {

        if(size == 0){
            throw new Exception("Empty List");
        }

        if(size == 1){
            return removeFirst();
        }

        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }

        int retVal = tail.data;
        tail = temp;
//        Node prev = getAtNode(size-1);
//       tail = prev;
        temp.next = null;
//        prev.next = null;
        size--;

        return retVal;
    }
    //RemoveFirst
    public int removeFirst() throws Exception {

        if(size == 0){
            throw new Exception("Empty List");
        }

        if(size == 1){
            head = null;
            tail = null;
            size = 0;
        }

        else{
            int retVal = head.data;
            head = head.next;
            size--;
            return retVal;
        }

        return -1;
    }
    //Get At Index
    public int getAtIndex(int index) throws Exception {

        Node temp = head;

        if(index < 0 || index > size){
            throw new Exception("Invalid index");
        }

        if(size  == 0){
            throw new Exception("Empty LinkedList");
        }

        else{
            int i = 0;
            while (temp.next != null){
                if(i == index){
                    return temp.data;
                }
                temp = temp.next;
                i= i+1;
            }

        }

        return -1;
    }
   // AddAtIndex
    public void AddAtIndex(int index, int value) throws Exception {

        Node temp = head;
        Node newNode = new Node(value);

        Node prev = getAtNode(index-1);
        newNode.next = prev.next;
        prev.next= newNode;

    }

    //Get Last
    public int getLast() throws Exception {

        Node temp = head;

        if(size == 0){
            throw new Exception("Empty LinkedList");
        }

        if(size  == 1){
            return getFirst();
        }

        if(size>1){
            return tail.data;
        }

        return -1;
    }

    //Get At Node
    public Node getAtNode(int index) throws Exception {

        Node temp = head;

        if(index < 0 || index > size){
            throw new Exception("Invalid index");
        }

        if(size  == 0){
            throw new Exception("Empty LinkedList");
        }

        else{
            int i = 0;
            while (temp.next != null){
                if(i == index){
                    return temp;
                }
                temp = temp.next;
                i= i+1;
            }

        }

        return null;
    }
    // Getfirst
    public int getFirst() throws Exception {

        Node temp = head;

        if(size == 0){
            throw new Exception("Empty LinkedList");
        }

        return temp.data;

    }

    //Insert First
    public void insFirst(int value){

        Node newNode = new Node(value);

        if (size == 0){
            head.next = newNode;
            tail = newNode;
            size++;
        }

        if(size >= 1){
            newNode.next = head.next;
            head.next = newNode;
            size++;
        }

    }

    //Insert Last
    public void insLast(int value){

        Node newNode = new Node(value);

        if (size == 0){
            head = newNode;
            tail = newNode;
            size++;
        }

        if(size >= 1){
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }
    //Linked list traversal
    public void display(){

        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }

        System.out.println("END");

        System.out.println("-------------------");
    }
}
