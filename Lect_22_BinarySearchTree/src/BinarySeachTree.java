public class BinarySeachTree {

    private Node root;

    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    public Node insert(int key){
        return insert(root, key);
    }
    private Node insert(Node node, int key){
        if(node == null){
            return new Node((key));
        }

        if(node.value >key){
            node.left = insert(node.left,key);
        }
        else{
            node.right = insert(node.right, key);
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
        display(root.left, indent+"\t");
        display(root.right, indent+"\t");
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node root) {
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public int successor(int k){
        return successor(root, k);
    }

    private int successor(Node root, int k) {
        Node success = null;
        Node current = root;

        while (current != null){
            if(current.value>k){
                if(success == null || success.value> current.value){
                    success = current;
                }
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
        return success.value;
    }

//    private int successor(Node root, int k) {
//        if(root == null){
//            return 0;
//        }
//
//
//        successor(root.left,k);
//        if(root.value > k){
//            return root.value;
//        }
//        successor(root.right, k);
//
//        return -1;
//    }
}
