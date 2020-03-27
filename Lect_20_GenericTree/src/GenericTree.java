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

    public  void maxNode(){

        System.out.println(max);
    }

    public void levelOrder(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value);
            for (int i = 0; i <temp.children.size() ; i++) {
                queue.add(temp.children.get(i));
            }
        }
    }


}
