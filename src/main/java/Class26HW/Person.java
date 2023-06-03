package Class26HW;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Person {
        /*
         Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.
         */
    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
class TestPerson{
    public static void main(String[] args) {

        Map<Integer,Person> a=new HashMap<>();
       a.put(1,new Person("Eric", "Forman", 17, 12000.55));
       a.put(2,new Person("Donna", "Pinciotti", 17, 12345.78));
       a.put(3,new Person("Jackie", "Burkhart", 16, 40000.90));
       a.put(4,new Person("Micheal", "Kelso", 18, 120.0));

        Map<Integer, Person> b = new HashMap<>(a); //can get same output without this. and same output with putAll research more.


        for (Map.Entry<Integer,Person> abc : b.entrySet()) {
            System.out.println("ID: "+abc.getKey());
            System.out.println(abc.getValue().toString());
        }

    }
}
