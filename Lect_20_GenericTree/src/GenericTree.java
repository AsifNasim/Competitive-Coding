import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {
static int max = Integer.MIN_VALUE;
    private Node root;
    public class Node{
        int value;
        ArrayList<Node> children;
         public Node(int value){
             this.value = value;
             this.children = new ArrayList<>();
         }
    }

    public void insert(Scanner s ){
        // only for root node
        System.out.println("Enter the value for root node: ");
        int value = s.nextInt();
        this.root = new Node(value);
        insert(s, root);
    }

    private void insert(Scanner s, Node root) {
        while (true){
            System.out.println("Do you want to add child of "+ root.value +" ?");
            boolean yes = s.nextBoolean();
            if (yes){
                System.out.println("Enter the child node: ");
                int value = s.nextInt();
                Node child = new Node(value);
                root.children.add(child);
                insert(s,child);
            }
            else{
                break;
            }

        }
    }
    public int count(){
        return count(root);
    }

    private int count(Node root) {
        // only when the user give root as null
        if(root == null){ //edge cases not the base case
            return 0;
        }
        int cnt = 1;
        for (int i = 0; i < root.children.size(); i++) {
            cnt += count(root.children.get(i));
        }
        return cnt;
    }

    public void display(){
        display(root,"");
    }

    private void display(Node root, String indent) {
        if(root.value > max){
            max = root.value;
        }
        System.out.println(indent+root.value);
        for (int i = 0; i < root.children.size(); i++) {
            display(root.children.get(i),indent+"\t");
        }
    }

    public int countRecursive(){
        return countRecursive(root);
    }

    private int countRecursive(Node root){
        int cnt = 1;
        for (int i = 0; i < root.children.size(); i++) {
            cnt += count(root.children.get(i));
        }

        return cnt;
    }

    public  void maxNode(){

        System.out.println(max);
    }

    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value+" ");
            for (int i = 0; i <temp.children.size() ; i++) {
                queue.add(temp.children.get(i));
            }
        }
        System.out.println();
    }
    public int sumOfAllNodes(){
        return sumOfAllNodes(root);
    }
    private int sumOfAllNodes(Node root){
        int sum = root.value;
        for (int i = 0; i < root.children.size(); i++) {
            sum += sumOfAllNodes(root.children.get(i));
        }
        return sum;
    }

    public int largestNode(){
        return largestNode(root);

    }

    private int largestNode(Node root) {
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int largest = root.value;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largestNode(root.children.get(i));
            if(childLargest > largest){
                largest = childLargest;
            }
        }
        return largest;
    }
    public int greaterThanX(int x){
        return greaterThanX(x, root);
    }

    private int greaterThanX(int x, Node root) {
        int count = 0;
        if(root == null){
            return 0;
        }
        if(root.value > x){
            count++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            count += greaterThanX(x,root.children.get(i));
        }
        return count;
    }
    public int height(){
        return height(root);
    }

    private int height(Node root) {
        int ans = 0;
        if(root == null){
            return 0;
        }
        for (int i = 0; i < root.children.size(); i++) {
            int childHeight= height(root.children.get(i));
            if(childHeight > ans){
                ans = childHeight;
            }
        }
        return ans+1;
    }

    public void depth(int k){
        depth(root, k);
    }

    private void depth(Node root, int k) {
        if(k < 0){
            return;
        }
        if(k == 0){
            System.out.print(root.value+" ");
        }
        for (int i = 0; i < root.children.size(); i++) {
            depth(root.children.get(i), k-1);
        }
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node root) {
        System.out.println(root.value);
        for (int i = 0; i < root.children.size(); i++) {
            preOrderTraversal(root.children.get(i));
        }
    }

    public int countLeafNodes(){
        return countLeafNodes(root);
    }

    private int countLeafNodes(Node root) {
        if(root == null){
            return 0;
        }
        if(root.children.size() == 0){
            return 1;
        }
        int count = 0;
        for (int i = 0; i < root.children.size(); i++) {
            count += countLeafNodes(root.children.get(i));

        }
        return count;
    }

}
