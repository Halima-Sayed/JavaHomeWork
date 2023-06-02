package Project2HW;

public class palindrome {
    /*
    Check if a String is Palindrome: Determine whether a given string is
a palindrome, which means it reads the same forwards and
backward. For example, "madam" is a palindrome
     */
    void checkPalindrome(String word){
        String reverse="";
        for (int i = word.length()-1; i>=0 ; i--) {
            reverse+=word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println("IS palindrome "+ reverse);
        }else{
            System.out.println("Not a palindrome");
        }
    }

    public static void main(String[] args) {
        palindrome p=new palindrome();
        p.checkPalindrome("madam");

    }
}
