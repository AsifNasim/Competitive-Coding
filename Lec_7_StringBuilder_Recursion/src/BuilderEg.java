public class BuilderEg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");


        String s ="";
        for (int i = 0; i < 100000; i++) {
            sb.append('a');
        }
        System.out.println(sb);
    }
}
