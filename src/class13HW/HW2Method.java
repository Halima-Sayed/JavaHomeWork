package class13HW;

public class HW2Method {
    public static String checkPalindrome(String hi) {
        StringBuilder sb = new StringBuilder(hi);
        String reverse = sb.reverse().toString();

        if (hi.equals(reverse)) {
            return "The word is palindrome";
        } else {
            return "The word is NOT palindrome";
        }
    }
}
