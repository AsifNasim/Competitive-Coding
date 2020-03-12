public class Human {
    String name;
    int salary;

    public Human(){
        this(10000);
    }
    public Human(int salary){
        this.salary = salary;

    }


    public void loan(){
        int temp = salary/10;
        salary = salary-temp;
    }
}
