package ProjectHW;

public class HW5 {
    public static void main(String[] args) {
        /*
        Write a program to swap 2 numbers without a
temporary variable?
         */
        int x=20;
        int y=10;
        x=x+y; // x=30  // We need to figure out the value of x first so we can swap y
        y=x-y; // y=20 // Done
        x=x-y; // x=10 //
        System.out.println("After swap x= "+x+" y= "+y);

        System.out.println("-------");
        int a = 2;
        int b = 10;

        a = a * b; // a now becomes 2
        b = a / b; // b becomes 2
        a = a / b; // a becomes 1

        System.out.println("a= "+a+" b= "+b);
    }
}
