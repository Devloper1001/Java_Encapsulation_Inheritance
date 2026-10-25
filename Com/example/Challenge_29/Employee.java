package Com.example.Challenge_29;

public class Employee {
    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, float salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails(){
        return "Employee details :- name :" +name+ " "+
                "age :" +age+" "+
                "salary:" +salary+" "
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
