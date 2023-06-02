package Class19;

public class HW3 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void divide(int a,int b){
        System.out.println(a/b);
    }
    static void divide(int a,double b){
        System.out.println(a/b);
    }
    static void divide(long a,int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
       divide(20,10);
       divide(15,5.5);
       divide(12345678,200);
    }
}
