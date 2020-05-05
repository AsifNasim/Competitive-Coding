import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {
    private Node root;
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }
    }

    public void insert(Scanner s ){
        this.root =  insert(root, s);
    }

    private Node insert(Node node, Scanner s) {
        if(node == null){
            System.out.println("Enter the value of root node: ");
            int nodeVal = s.nextInt();
            return  new Node(nodeVal);
        }
        System.out.println("Enter the Direction:  left or right. ");
        String dir = s.next();
        if(dir.equals("left")){
            node.left = insert(node.left, s);
        }
        else{
            node.right = insert(node.right, s);
        }

        return node;
    }
    public void display(){
        display(root);
    }

    private void display(Node node) {
        if (node == null){
            return;
        }
        System.out.println(node.value);
        display(node.left);
        display(node.right);
    }
    public void preOrderDisplay(){
        preOrderDisplay(root);
    }

    private void preOrderDisplay(Node node) {
        if (node == null){
            return;
        }
        System.out.println(node.value);
        preOrderDisplay(node.left);
        preOrderDisplay(node.right);
    }
    public void postOrderDisplay(){
        postOrderDisplay(root);
    }

    private void postOrderDisplay(Node node) {
        if (node == null){
            return;
        }

        postOrderDisplay(node.left);

        postOrderDisplay(node.right);
        System.out.println(node.value);
    }
    public void InOrderDisplay(){
        InOrderDisplay(root);
    }

    private void InOrderDisplay(Node node) {
        if (node == null){
            return;
        }

        InOrderDisplay(node.left);
        System.out.println(node.value);
        InOrderDisplay(node.right);
    }

    public int height(){
        return height(root);
    }

    private int height(Node node) {
        if (node == null){
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public boolean findNode(int k){
        return findNode(root, k);
    }

    private boolean findNode(Node node, int k) {
        if(node == null){
            return false;
        }

        if(k == node.value){
            return true;
        }

        return findNode(node.left, k) || findNode(node.right, k);
    }

    public void levelOrder(){
        levelOrder(root);
    }

    private void levelOrder(Node node) {
        if(node == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.println(temp.value);
            if(temp.left != null){
                queue.add(temp.left);
            }
            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
    private void SumAtLevel(Node node, int level) {
        if(node == null){
            return;
        }
        int sum = 0;
        int k = 0;
        int p =0;
        ArrayList<Node> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp.left != null){
                k = k+1;
                if(k == level){
                    list.add(temp.left);
                }
                queue.add(temp.left);
            }
            if(temp.right != null){
                p = p+1;
                if(p == level){
                    list.add(temp.right);
                }
                queue.add(temp.right);
            }
            for (int i = 0; i <list.size() ; i++) {
                sum += list.get(i).value;
            }
            System.out.println(sum);
        }
    }

    public void AtlevelSum(int k){
        AtlevelSum(root, k);
    }

    private void AtlevelSum(Node node, int k) {
        if(node == null){
            return;
        }
        int sum =0;
        ArrayList<Node> list = new ArrayList<>();
        if(k == 0){
            list.add(node);
//            System.out.println(node.value);
        }

        AtlevelSum(node.left, k-1);
        AtlevelSum(node.right, k-1);
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).value;
        }
        System.out.println(sum);
    }

    public int diameter(){
        return diameter(root);
    }

    private int diameter(Node root) {
        if(root == null){
            return 0;
        }

        int option1 = height(root.left) +height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);

        return Math.min(option1, Math.max(option2,option3));
    }

}
