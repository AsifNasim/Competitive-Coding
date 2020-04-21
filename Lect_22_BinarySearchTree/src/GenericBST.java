//public class GenericBST<T extends Comparable<T>> {
//    private Node root;
//
//    class Node{
//        int value;
//        Node left;
//        Node right;
//
//        public Node(int value){
//            this.value = value;
//        }
//    }
//
//    public Node insert(int key){
//        return insert(root, key);
//    }
//    private  insert(Node node, T key){
//        if(node == null){
//            return new Node((key));
//        }
//
//        if(node.value.comkey){
//            node.left = insert(node.left,key);
//        }
//        else{
//            node.right = insert(node.right,key);
//        }
//
//        return node;
//    }
//
//    public void display(){
//        display(root, "");
//    }
//
//    private void display(BinarySeachTree.Node root, String indent) {
//        if(root == null){
//            return;
//        }
//        System.out.println(root.value);
//        display(root.left, indent+"\t");
//        display(root.right, indent+"\t");
//    }
//
//    public void inOrder(){
//        inOrder(root);
//    }
//
//    private void inOrder(BinarySeachTree.Node root) {
//        inOrder(root.left);
//        System.out.println(root.value);
//        inOrder(root.right);
//    }
//
//    public int successor(int k){
//        return successor(root, k);
//    }
//
//    private int successor(BinarySeachTree.Node root, int k) {
//        BinarySeachTree.Node success = null;
//        BinarySeachTree.Node current = root;
//
//        while (current != null){
//            if(current.value>k){
//                if(success == null || success.value> current.value){
//                    success = current;
//                }
//                current = current.left;
//            }
//            else{
//                current = current.right;
//            }
//        }
//        return success.value;
//    }
//}
