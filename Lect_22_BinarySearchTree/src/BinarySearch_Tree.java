import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Tree {
    private Node root;
    class Node{ 
        int height;
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
            this.height = 1;
        }
    }

    public void insert(int key){
        this.root = insert(root, key);

    }

    private Node insert(Node node, int k) {
        if(node == null){
            return new Node(k);
        }

        if(node.value > k){
            node.left = insert(node.left, k);
        }
        else{
            node.right = insert(node.right, k);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
//        return node;
    }

    public void display(){
        display(root);
    }

    private void display(Node node) {
        if(node == null){
            return;
        }
        System.out.println(node.value);
        display(node.left);
        display(node.right);
    }

    public void inOrder(){  // print in sorted order
        inOrder(root);
    }

    private void inOrder(Node node) {
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public int successor(int k){
        return successor(root, k);
    }

    private int successor(Node root, int k) {
        Node success = null;
        Node current  = root;
        while (current != null){
            if(current.value> k){
                if((success == null) || (success.value >current.value)){
                    success = current;
                }
                current = current.left;
            }
            else {
                current = current.right;
            }

        }
        return success.value;
    }

    public void inRange(int k1, int k2){
        inRange(root, k1, k2);
    }

    private void inRange(Node node, int k1, int k2) {
        if(node == null){
            return;
        }
        if(node.value > k1 && node.value < k2 ){
            System.out.print(node.value+" ");
        }

        if(node.value > k1){
            inRange(node.left, k1, k2);
        }
        if(node.value < k2){
            inRange(node.right, k1, k2);
        }
    }

    public int  height(){
        return height(root);
    }

    public int height(Node node) {
        if(node == null){
            return 0;
        }
        return node.height;
        //return 1+ Math.max(height(node.left), height(node.right));
    }



    public void makeFromSorted(int [] arr, int start, int end){
        if(start > end){
            return;
        }
        int mid = (start+ end)/2;
        insert(arr[mid]);

        makeFromSorted(arr, start, mid-1);
        makeFromSorted(arr,mid+1, end);
    }


    public void makeFromPreIn(int [] pre, int [] in){
        this.root = makeFromPreIn(root, pre,in);
    }



    private Node makeFromPreIn(Node node, int[] pre, int[] in) {
        if(in.length == 0){
            return node;
        }

        int elem = pre[0];

        int index = find(in, elem);

        int [] in_left = Arrays.copyOfRange(in, 0, index);
        int [] in_right = Arrays.copyOfRange(in, index+1, in.length);

        int [] pre_left = Arrays.copyOfRange(pre, 1, index+1);
        int [] pre_right = Arrays.copyOfRange(pre, index+1, pre.length);
        Node node1 = new Node(elem);

        node1.left = makeFromPreIn(node1.left,pre_left, in_left);
        node1.right =makeFromPreIn(node1.right, pre_right, in_right);

        return node1;


    }

    private int find(int [] in, int elem) {
        for (int i = 0; i <in.length ; i++) {
            if(elem == in[i]){
                return i;
            }
        }
        return -1;
    }

    public boolean isBalanced(){
        return isBalanced(root);
    }

    private boolean isBalanced(Node node) {
        if(node == null){
            return true;
        }

        int balFact = Math.abs(height(node.left)- height(node.right));

        if(balFact > 1){
            return false;
        }

        boolean left = isBalanced(node.left);
        boolean right = isBalanced(node.right);

        return (left && right);
    }
    public int max(){
        return max(this.root);
    }

    private int max(Node node) {
        if(node.right ==  null){
            return node.value;
        }
        return max(node.right);
    }
    private void add(int item){
        add(this.root, item);
    }

    private void add(Node node, int item) {
        if(item > node.value){
            if(node.right == null){
                Node nn = new Node(item);
                node.right = nn;
            } else
            {
                add(node.right, item);
            }

            if(node.left == null){
                Node nn = new Node(item);
                node.left = nn;
            } else
            {
                add(node.left, item);
            }

        }
    }

    

}
 