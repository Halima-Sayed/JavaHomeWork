package Project2HW;

public abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
     */
    abstract double getPercentage();
}
class A extends Marks{
    private int math;
    private int english;
    private int science;

    public A(int math, int english, int science) {
        this.math = math;
        this.english = english;
        this.science = science;
    }

    @Override
    double getPercentage() {
        double average=(math +english +science)/3.0;
        return average;
    }
}
class B extends Marks{
    private  int math;
    private int english;
    private  int science;
    private int history;
    public B(int math, int english, int science, int history) {
        this.math = math;
        this.english = english;
        this.science = science;
        this.history = history;
    }

    @Override
    double getPercentage(){
        double average=(math +english +science)/4.0;
        return average;

}
}
class MarkTester{
    public static void main(String[] args) {
        A a=new A(80,100,90);
        System.out.println("Students A's average grade =" +a.getPercentage());

        B b=new B(75,50,70,100);
        System.out.println("Students B's average grade =" +b.getPercentage());
    }
}