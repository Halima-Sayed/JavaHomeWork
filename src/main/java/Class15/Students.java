package Class15;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String name;
    String id;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.name="Ted";
        student1.id="12A34";
        student1.numberOfStudents++;


        Students student2=new Students();
        student2.name="Marshall";
        student2.id="56B78";
        student2.numberOfStudents++;


        Students student3=new Students();
        student3.name="Lily";
        student3.id="90C12";
        student3.numberOfStudents++;

        System.out.println("The number of students in this class are "+numberOfStudents);
    }
}
