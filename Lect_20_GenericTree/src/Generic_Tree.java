import java.util.ArrayList;
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
}