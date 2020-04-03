import java.util.Scanner;

public class BinaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }
    private Node root;

    public void insert(Scanner s){
        this.root = insert(root, s);
    }

    private Node insert(Node node, Scanner s) {
        if(node ==  null){
            System.out.println("Enter the value of root node");
            int val = s.nextInt();
//            int val = Integer.parseInt(s.nextLine());
            return new Node(val);
        }
        System.out.println("Enter the Direction, whether left or right: ");
        String dir = s.next();
        if(dir.equals("left")){
            node.left = insert(node.left,s);
        }
        else{
            node.right = insert(node.right,s);
        }
        return node;
    }

    public void display(){
        display(root, "");
    }

    private void display(Node root, String indent) {
        if(root == null){
            return;
        }

        System.out.println(root.value);
        display(root.left,indent+"\t");
        display(root.right,indent+"\t");
    }
}
