public class StackUsingArraysClient {
    public static void main(String[] args) throws Exception {
        StackUsingArray2 stack = new StackUsingArray2(5);
//        stack.push(10);
//        stack.display2();

        for (int i = 1; i <=9 ; i++) {
            stack.push(i*10);
            stack.display2();
        }
//        stack.push(55);
    }
}
