import java.util.ArrayList;
import java.util.Scanner;

public class MazePathCB {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int er = s.nextInt();
        int ec = s.nextInt();
        ArrayList<String> list = mazePathCBDiag(0,0,er,ec);
        System.out.println(list);
    }

    private static ArrayList<String> mazePathCB(int cr, int cc, int er, int ec) {
        if(cr == er && cc == ec){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if(cr > er || cc > ec){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> myres = new ArrayList<>();
        ArrayList<String> recresH = mazePathCB(cr, cc+1, er, ec);
        for (String rrsh: recresH) {
            myres.add("H"+rrsh);
        }
        ArrayList<String> recresV = mazePathCB(cr+1, cc, er, ec);
        for (String rrsv: recresV) {
            myres.add("V"+rrsv);
        }

        return myres;
    }

    private static ArrayList<String> mazePathCBDiag(int cr, int cc, int er, int ec) {
        if(cr == er && cc == ec){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        if(cr > er || cc > ec){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> myres = new ArrayList<>();
        ArrayList<String> recresH = mazePathCBDiag(cr, cc+1, er, ec);
        for (String rrsh: recresH) {
            myres.add("H"+rrsh);
        }
        ArrayList<String> recresV = mazePathCBDiag(cr+1, cc, er, ec);
        for (String rrsv: recresV) {
            myres.add("V"+rrsv);
        }
        ArrayList<String> recresD = mazePathCBDiag(cr+1, cc+1, er, ec);
        for (String rrsd: recresD) {
            myres.add("D"+rrsd);
        }

        return myres;
    }
}
