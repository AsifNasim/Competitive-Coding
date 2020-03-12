public class Student {
    //Accessing static object is always done with the name of class
    //-->A static thing can only access static object while a non static can access both
    private String name;

//    public Student() {
//        rollNo = 0;
//    }

    //private for data hiding
    public String getName(){
        return this.name;
    }

    public void setName(String name) throws Exception{
        //business rule checked
        if(name.equals("") || name == null){
            throw new Exception("Name cannot be null");
        }
        this.name = name;
    }
    //final means value can be set only once
    private  final int rollNo;
    private static int  NumOfStudents;

    public static int getNumOfStudents(){
        return Student.NumOfStudents;
    }
    private static String UniformColor = "white";
    public static String getUniformColor(){
        return Student.UniformColor;
    }

    public static void setUniformColor(String UniformColor){
        Student.UniformColor = UniformColor;
    }

    public static final int MAX_STUDENTS = 1000;
    public Student(String name) throws Exception{
        //business rules checked
        if(Student.NumOfStudents == Student.MAX_STUDENTS){
            throw new Exception("Max limit reached");
        }
        this.name = name;
        Student.NumOfStudents++;
        this.rollNo = Student.NumOfStudents;


        //can access both static and non static data member
//        public void ANonStaticFunction(){
//            System.out.println(this.name+" say hello to "+ Student.NumOfStudents);
//        }
//        //can use only static data members
//        //can't use this
//        //can't use non static data member
//        //no need to create objects, can be called directly via class
//        //
//        public static void AStaticFunction(){
//            System.out.println(Student.NumOfStudents+" out of "+Student.MAX_STUDENTS);
//        }
    }
}
