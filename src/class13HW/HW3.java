package class13HW;

public class HW3 {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?
         */
        String s1 = "Hi";
        String s2 = "Hello";
        System.out.println("Before swapping \ns1 = " + s1 + " \ns2 = " + s2);

        s1 = s1 + s2;
        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());
        System.out.println("After swapping \ns1 = " + s1 + "\ns2 = " + s2);
    }
}
