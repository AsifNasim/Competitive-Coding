import java.io.File;
import java.util.Scanner;

public class Binary_TreeClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Binary_Tree tree = new Binary_Tree();
        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.display();
        System.out.println("PreOrder Traversal\t");
        tree.preOrderDisplay();
        System.out.println("InOrderTraversal\t");
        tree.InOrderDisplay();
        System.out.println("PostOrder\t");
        tree.postOrderDisplay();
        tree.AtlevelSum(2);

    }
}
