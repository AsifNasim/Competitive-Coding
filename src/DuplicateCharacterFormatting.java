import java.util.Scanner;

public class DuplicateCharacterFormatting {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
       String ans = duplicateChar(s.next());
        System.out.println(ans);
    }

    private static String duplicateChar(String unprocessed) {

        if(unprocessed.length() <= 1){
            return unprocessed;
        }

        String output = duplicateChar(unprocessed.substring(1));
        if(unprocessed.charAt(0) == unprocessed.charAt(1)){
            output =unprocessed.charAt(0) +"*"+ unprocessed.charAt(1)+ output.substring(1);
        }
        else{
            output = unprocessed.charAt(0)+ output;
        }
        return output;
//        String result = "";
//        if(unprocessed.length() <= 1){
//            return result;
//        }
//        char ch1 = unprocessed.charAt(0);
//        char ch2 = unprocessed.charAt(1);
//        duplicateChar(unprocessed.substring(1));
//        if(ch1 == ch2){
//            result += ch1+"*"+ch2;
//        }
//        else{
//            result += ch1+""+ch2;
//        }

//        if(unprocessed.length() == 0){
//            System.out.println(processed);
//            return;
//        }
//
//        char ch1 = unprocessed.charAt(0);
//        unprocessed = unprocessed.substring(1);

//        if(ch1 == unprocessed.charAt(0)){
//            duplicateChar(ch1+"*"+unprocessed.charAt(0), unprocessed.substring(1));
//        }
//        else{
//            duplicateChar(ch1+""+unprocessed.charAt(0), unprocessed.substring(1));
//        }

    }

}
