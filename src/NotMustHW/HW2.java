package NotMustHW;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        /*
        Ask user to enter a number and then define if number is small, medium or large
Small number is value between 1 and 10
Medium number is value between 11 and 100
Large number is value between 101 and 1000

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the number small,medium or large");

        int num = scan.nextInt();

        if (num <=10) {
            System.out.println("Number is small");
        } else if (num >= 11 && num <= 100) {
            System.out.println("Number is medium");
        } else if (num >= 101 && num <= 1000) {
            System.out.println("Number is large");

        }


    }
}

