package Class9HW;

public class HW8 {
    public static void main(String[] args) {
        /*
        Create an array to store char values and then print those in reverse order
         */

        char[] letters = {'A', '*', 'B', '#', 'C', '@'};

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i]);
        }
    }


}
