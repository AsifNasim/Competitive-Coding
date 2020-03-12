public class StudentClient {
    public static void main(String[] args) {
        Student [] students = new Student[1000];
        for (int i = 0; i < students.length; i++) {
            System.out.println(Student.getNumOfStudents());
        }
//        students[250].rollNo = 10;
//        System.out.println(students[250].rollNo);

        System.out.println(students[250].getName());
//        students[250].setName("Asif");
//
//        students[250].ANonStaticFunction();
//        students[250].AStaticFunction();
        students[250].setUniformColor("Blue");

    }
}
