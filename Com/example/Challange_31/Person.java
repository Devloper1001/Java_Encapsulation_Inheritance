package Com.example.Challange_31;

import java.util.Objects;

public class Person {
    private String name ;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age ;
    }

    @Override
    public boolean equals(Object obj) {
       if(!(obj instanceof Person)){
           return false;
       }
       Person per = (Person) obj;
       return per.age == age && per.name.equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Gagandeep",20);
        Person person2 = new Person("Gagandeep",20);

        if (person1.equals(person2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
    }
}
