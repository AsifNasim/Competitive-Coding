import javax.swing.*;
import java.util.ArrayList;

public class mazePath {
    public static void main(String[] args) {
        mazePath("",3,3);
       ArrayList ans =  mazePathList("",3,3);
        System.out.println(ans);
//        mazePathCount("",3,3);
    }

    private static void mazePath(String processed, int row, int col){

        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }
        if(row > 1){
            mazePath(processed+"v", row-1, col);
        }
        if(col > 1){

            mazePath(processed+ "h", row, col -1);
        }
    }

    private static ArrayList mazePathList(String processed, int row, int col){
        ArrayList list = new ArrayList();
        if(row == 1 && col == 1){
            list.add(processed);
            return list;
        }
        if(row > 1){
            list.addAll(mazePathList(processed+"v", row-1, col));
        }
        if(col > 1){

            list.addAll(mazePathList(processed+ "h", row, col -1));
        }
     return list;
    }

//    private static int mazePathCount(String processed, int row, int col){
//        if(row == 1 && col == 1){
//            System.out.println(processed);
//            return 1;
//        }
//        int count = 0;
//        if(row > 1){
//            count +=mazePath(processed+"v", row-1, col);
//        }
//        if(col > 1){
//            count +=mazePath(processed+ "h", row, col -1);
//        }
//        return count;
//    }
}
