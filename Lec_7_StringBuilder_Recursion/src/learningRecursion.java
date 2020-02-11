public class learningRecursion {
    public static void main(String[] args) {
        pd4();
        System.out.println("jaa rha hoon 4");
    }

    private static void pd4() {
        System.out.println(4);
        pd3();
        System.out.println("jaa rha hoon 3");
    }

    private static void pd3() {
        System.out.println(3);
        pd2();
        System.out.println("jaa rha hoon 2");
    }

    private static void pd2() {
        System.out.println(2);
        pd1();
        System.out.println("jaa rha hoon 1");
    }

    private static void pd1() {
        System.out.println(1);
    }
}
