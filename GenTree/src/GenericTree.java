import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
static Scanner s = new Scanner(System.in);
    // creating node type for tree
    private class Node{
        int data;
        ArrayList<Node> children;

        // creating constructor of node type
        Node(int data){
            this.data = data;
            this.children = new ArrayList<>();
        }
    }

    // for traversal
    private Node root;
    private int size;

    GenericTree(){
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, 0);
    }

    private Node takeInput(Scanner s, Node parent, int ithChild){
        if(parent == null){
            System.out.println("Enter the data fr root node");
        }
        else{
            System.out.println("Enter the data for the"+ ithChild+" of"+ parent.data);
        }
        int nodeData = s.nextInt();
        Node node = new Node(nodeData);
        this.size++;
        System.out.println("Enter the number of children for "+node.data);
        int children = s.nextInt();
        for (int i = 0; i < children; i++) {
            // will be executed according to the value of the children
            Node child = takeInput(s,node,i);
            node.children.add(child);
        }
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node) {
        String str =node.data+"=>";
        for (int i = 0; i < node.children.size(); i++) {
//            str = str.node.children.get(i).data;
        }
        str = str +"END";
        System.out.println(str);

        for (int i = 0; i < node.children.size(); i++) {
            this.display(node.children.get(i));
        }
    }

}
