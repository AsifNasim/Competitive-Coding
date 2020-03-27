import java.util.Scanner;

public class GenericClient {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        GenericTree Tree = new GenericTree();
        Tree.insert(s);
        Tree.display();
        System.out.println(Tree.count());
        Tree.maxNode();
        Tree.levelOrder();
    }
}
