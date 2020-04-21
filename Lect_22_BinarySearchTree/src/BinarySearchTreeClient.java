public class BinarySearchTreeClient {
    public static void main(String[] args) {
        BinarySeachTree tree = new BinarySeachTree();
        tree.insert(4);
        tree.insert(3);
        tree.insert(6);
        tree.display();
        System.out.println(tree.successor(1));


    }
}
