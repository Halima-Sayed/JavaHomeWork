package Project2HW;

public class FirstNonRepeatingChar {
    /*
    Find the First Non-Repeating Character in a String: Given a string,
find and return the first non-repeating character. For example, in the
string "abracadabra", the first non-repeating character is 'c'.

     */

    public static char findFirstNonRepeatingChar(String word){
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            if(word.indexOf(c)==word.lastIndexOf(c)){
                return c;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String a="abracadabra";
        char c2=findFirstNonRepeatingChar(a);

        if(c2!='\0'){
            System.out.println("The first non-repeating character is= "+c2);
        }else {
            System.out.println("No non-repeating character");
        }
    }
}
