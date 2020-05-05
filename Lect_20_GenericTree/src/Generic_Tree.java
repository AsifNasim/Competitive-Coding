import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generic_Tree {
    public class Node{
        int value;
        ArrayList<Node> children;
        public Node(int value){
            this.value = value;
            this.children = new  ArrayList<>();
        }
    }
    private Node root;

    public void insert(Scanner s){

        System.out.println("Enter the root Node :");
        int nodeVal = s.nextInt();
        this.root = new Node(nodeVal);
        insert(s,root);
    }

    private void insert(Scanner s, Node root) {
        while (true) {
            System.out.println("Do you want to add the child of  "+root.value);
            boolean yes = s.nextBoolean();
            if (yes){
                System.out.println("Enter the value of child node ");
                int childNode = s.nextInt();
                Node child = new Node(childNode);
                root.children.add(child);
                insert(s,child);
            }
            else{
                break;
            }
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node root) {
        System.out.println(root.value);
        for (int i = 0; i < root.children.size(); i++) {
            display(root.children.get(i));
        }
    }

    public int countNode(){
        return countNode(root);
    }

    private int countNode(Node root) {
        int count = 1;
        if(root == null){
            return 0;
        }
        else{
            for (int i = 0; i < root.children.size(); i++) {
                count += countNode(root.children.get(i));
            }
        }
        return count;
    }

    public int MaxNode(){
        int max = root.value;
       return MaxNode(root,max);
    }

    private int MaxNode(Node root, int max) {
        if(root == null){
            return 0;
        }

        if(max < root.value){
            max = root.value;
        }
        for (int i = 0; i < root.children.size(); i++) {

           max = MaxNode(root.children.get(i),max);
        }
        return max;
    }
    public void levelOrder(){
        levelOrder(root);
    }

    private void levelOrder(Node root) {
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.println(temp.value);
            for (int i = 0; i < temp.children.size(); i++) {
                queue.add(temp.children.get(i));
            }
        }
    }

    public void AtLevelK(int k){
        AtLevelK(root, k);
    }

    private void AtLevelK(Node root, int k) {
        if(root == null){
            return;
        }

        if(k == 0){
            System.out.println(root.value);
        }

        for (int i = 0; i < root.children.size(); i++) {
            AtLevelK(root.children.get(i), k-1);
        }

    }

}