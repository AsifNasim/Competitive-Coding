public class PersonCleint {
    //objects are made in heap.
    // references are stored in stack
    public static void main(String[] args) {
        // Firstly the default constructor will be called
        Person p1 = new Person();
//        p1.setName("Asif");
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.setName("Asif");
        p1.setAge(22);

        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    //.(dot) operator is used to access the properties

        Person p2 = new Person("Asif");

        System.out.println(p2.getName());

        Person p3 = new Person("Nasim", 22);


        System.out.println(p3.getAge());
    }
}
