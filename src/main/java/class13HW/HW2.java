package class13HW;

import static class13HW.HW2Method.checkPalindrome;

public class HW2 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
Abbc =>false
         */
        String str1 = "Kayak";
        str1 = str1.toUpperCase();
        String str2 = "Water";
        String str3 = "farwa";
        String str4 = "Wow";

        System.out.println(str1 + " " + checkPalindrome(str1));
        System.out.println(str2 + " " + checkPalindrome(str2));
        System.out.println(str3 + " " + checkPalindrome(str3));
        System.out.println(str4 + " " + checkPalindrome(str4));
    }
}

