public class OverLoading_OverRiding {
    //variable number of arguments
    public static int sum(int ... args){
        int sum =0;
        for(int val:args){
            sum += val;
        }
        return sum;
    }
//    public static int func(String str, int... args){
//
//    }
}
