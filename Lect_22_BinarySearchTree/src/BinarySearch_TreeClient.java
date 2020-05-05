import java.util.Scanner;

public class BinarySearch_TreeClient {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        BinarySearch_Tree tree = new BinarySearch_Tree();

//        tree.insert(2);
//        tree.insert(3);
//        tree.insert(4);
//        tree.display();
//        tree.inOrder();
//        System.out.println("successor of " + 2 + "is  "+ tree.successor(2));
//        tree.inRange(2,7);
//        System.out.println("\n");
//        System.out.println(tree.height());
//        int [] arr = {1,2,3,4,5,6};
//        tree.makeFromSorted(arr, 0, arr.length-1);
//        tree.display();

        int [] pre = {5,3,1,4,7};
        int [] in = {1,3,4,5,7};

        tree.makeFromPreIn(pre, in);
        tree.display();
    }

}
