import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }}
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
    public void postDisplay(){
        postDisplay(root, "");
    }

    private void postDisplay(Node root, String indent) {
        if(root == null){
            return;
        }
        postDisplay(root.left, indent+"\t");
        postDisplay(root.right, indent+"\t");
        System.out.println(root.value);
    }

    public void inOrder(){
        inOrder(root, "");
    }

    private void inOrder(Node root, String indent) {
        if(root  == null){
            return;
        }
        inOrder(root.left, indent+"\t");
        System.out.println(root.value);
        inOrder(root.right, indent+"\t");
    }

    public int  height(){
        return height(root);
    }

    private int height(Node root) {
        if(root == null){
            return 0;
        }
        return Math.max(height(root.left), height(root.right))+1;
    }
    public boolean isPresent(int target){
        return isPresent(root, target);
    }

    private boolean isPresent(Node root, int k){
        if(root == null){
            return false;
        }
        if (root.value == k){
            return true;
        }

       return isPresent(root.left,k) || isPresent(root.right,k);


    }

    public void levelOrderPrint(){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (! queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value+" ");

            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
    public void Atlevel(int k){
        AtLevel(root, k);
    }

    private void AtLevel(Node node,int k){
        if(node == null){
            return;
        }

        if(k == 0){
            System.out.print(node.value+" ");
        }

        AtLevel(node.left, k-1);
        AtLevel(node.right, k-1);
    }

//    public void AtLevelPrint(int level){
//        int k =0;
//        int p =0;
//        ArrayList list = new ArrayList();
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (! queue.isEmpty()){
//            Node temp = queue.remove();
//            if(temp.left != null){
//                k = k+1;
//                if(k == level){
//                    list.add(temp.left);
//                }
//                queue.add(temp.left);
//            }
//            if(temp.right != null){
//                p = p+1;
//                if(p == level){
//                    list.add(temp.right);
//                }
//                queue.add(temp.right);
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//    }


}
