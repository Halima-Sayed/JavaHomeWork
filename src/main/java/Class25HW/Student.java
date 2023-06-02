package Class25HW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Student {
    /*
       Create a Set that will hold Objects of Student Type. In this set we do not care about the insertion order.
       Each student object should have name and studentID. Display name of each student.
        */
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }


    public static void main(String[] args) {
        Set<Student> a=new HashSet<>();
        a.addAll(Arrays.asList(
                new Student("Omar",123),
                new Student("Isra",456),
                new Student("Naila",789),
                new Student("Hamza",101112)));

        for(Student b:a){
            System.out.println(b.getName()+" "+b.getId());
        }
    }
}
