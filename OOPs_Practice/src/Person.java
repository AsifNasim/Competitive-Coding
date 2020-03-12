public class Person {
    private String name ;
    private int age;
    //an object is made through a class
    // there are two types of constructors. 1- Default 2- parameterized
    public Person(){
        System.out.println("I am in default constructor");
    }
    public Person(String name){
        this.name = name;
        System.out.println("I am param constructor with with one parameter");
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("I am param constructor with with two parameter");
    }



    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
        //This refers to instance variable
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
