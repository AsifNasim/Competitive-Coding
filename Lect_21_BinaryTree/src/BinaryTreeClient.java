import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner s = new Scanner(System.in);

        tree.insert(s);
        tree.insert(s);
        tree.insert(s);
        tree.display();
        System.out.println(tree.isPresent(3));
        tree.levelOrderPrint();
    }
}
