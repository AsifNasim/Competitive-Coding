import java.util.Scanner;

public class BalancedParenthesis {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

//            int size = s.nextInt();
//            char [] exp = new char[size];
            String str = s.next();
            boolean isBal = isBalanced(str);
        System.out.println(isBal);
    }

    private static boolean isBalanced(String str) throws Exception {
        StackUsingArrays stack = new StackUsingArrays();
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)== '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
              stack.push(str.charAt(i));
            }
            else if(str.charAt(i)== ')' || str.charAt(i) == '}' || str.charAt(i) == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char ch = (char) stack.pop();

                if(str.charAt(i) == ')' && ch =='('){
                    continue;
                }
                else if(str.charAt(i)== '}' && ch =='{'){
                    continue;
                }
                else if(str.charAt(i) == '[' && ch ==']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }


}
