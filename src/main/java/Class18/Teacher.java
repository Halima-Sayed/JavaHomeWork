package Class18;

import java.sql.SQLOutput;

public class Teacher {
    //Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
    // Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes

    String name;
    String subject;
    int age;

    void pen(){
        System.out.println("I have colorful pens");
    }
    void introduce(){
        System.out.println("Hi my name is "+name+" and I am "+age+" years old and I teach "+subject);
    }
    void board(){
        System.out.println("I have a whiteboard in my class");
    }
    void fun(){
        System.out.println("My class is fun");
    }

}
class MathTeacher extends Teacher{

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher MT=new MathTeacher();
        MT.name="Lily";
        MT.age=33;
        MT.subject="Math";
        MT.introduce();
        MT.board();
        MT.fun();

        ChemistryTeacher CT=new ChemistryTeacher();
        System.out.println("---------------------------------------------------------------");
        CT.name="Mark";
        CT.age=35;
        CT.subject="Chemistry";
        CT.introduce();
        CT.board();
        CT.fun();

        PianoTeacher PT=new PianoTeacher();
        System.out.println("---------------------------------------------------------------");
        PT.name="Jane";
        PT.age=45;
        PT.subject="Piano";
        PT.introduce();
        PT.board();
        PT.fun();
    }
}
