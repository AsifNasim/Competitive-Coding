import java.util.Scanner;

public class Generic_TreeClient {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Generic_Tree tree = new Generic_Tree();
        tree.insert(s);
        tree.display();
        System.out.println("Total number of nodes: " + tree.countNode());
        System.out.println("Max node in the tree: "+ tree.MaxNode());
    }
}
