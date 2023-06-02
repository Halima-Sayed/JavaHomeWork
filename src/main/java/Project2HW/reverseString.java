package Project2HW;

public class reverseString {
    /*
    Reverse a String: Write a function to reverse a given string. For
example, given the input "Hello", the output should be "olleH".
     */
    static String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }

}

