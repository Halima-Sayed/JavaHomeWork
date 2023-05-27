package Project2HW;

public class countNumberOfWords {
    /*
    Count the Number of Words in a String: Write a function to count the
number of words in a given string. Words are separated by spaces or
punctuation. For example, the input "Hello, world!" should return 2.

     */
    public static void main(String[] args) {
        String sentence="Hello, world! I . . ! ? am counting the words in this sentence";
        String [] count=sentence.split("[\\p{Punct}\\s]+");
        System.out.println(count.length);
    }
}
