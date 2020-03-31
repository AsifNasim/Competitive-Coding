import java.sql.SQLOutput;
import java.util.Scanner;

public class GenericClient {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        GenericTree Tree = new GenericTree();
        Tree.insert(s);
//        Tree.display();
//        System.out.println(Tree.count());
//        Tree.maxNode();
        Tree.levelOrder();
        System.out.println("Sum of all the nodes: "+ Tree.sumOfAllNodes());
        System.out.println("Largest Node: "+ Tree.largestNode());
        System.out.println("Number of nodes greater than x : "+ Tree.greaterThanX(35));
        System.out.println("Height of the tree is; "+ Tree.height());
        System.out.println("Total number of nodes present in this Tree is: "+Tree.countRecursive());
        Tree.depth(2);
        Tree.preOrderTraversal();
        System.out.println("Number of leaf Nodes: "+ Tree.countLeafNodes());
    }
}
