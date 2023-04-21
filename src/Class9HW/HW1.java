package Class9HW;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        //Create an array of chars and store grades into it: A,B,C,D.
        // Then print a grade B (use 2 different ways of creating an array).
        char[] letters = {'a', 'b', 'c', 'd'};
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 'b') {
                System.out.println(letters[i]);
            }

        }

        char[] letters2 = new char[4];
        char var = 'a';


        for (int i = 0; i < letters2.length; i++) {

            letters2[i] = var;
            var++;
        }

        for (char letter : letters2) {
            if (letter == 'b')
                System.out.println(letter);

        }

    }
}