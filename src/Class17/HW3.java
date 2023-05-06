package Class17;

public class HW3 {

    //Write program that have static constructor and observe result.
    //Answer on line 18.

   /* static HW3() {
        System.out.println("Static Constructor");
    }

    public static void main(String[] args) {
        HW3 obj = new HW3();
    }
    */

    /*
    A static constructor is not allowed in Java programming. It is against Java standards hence,
     why the Java program will not be compiled and throw a compile-time error.
     Error on the console will say (modifier static not allowed here) when you try to print it out.
     The reason why constructors can't be static is that if we will declare static constructor then we can not access/call the constructor from a subclass.
     Because we know static is allowed within a class but not by a subclass.
     If I were asked to write a static initialization block then that can be solvable.
     */
}




