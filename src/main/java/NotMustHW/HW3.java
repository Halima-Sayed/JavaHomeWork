package NotMustHW;

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
       /* Write a program that will ask user to input inputs the current time (use 24 hour format).
                Based on the given time define:
        if hour is between 1-11 --> Morning
        if hour between 12-15 --> Afternoon
        if hour between 16-20 --> Evening
        if hour between 21-24 --> Night

        */
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the time");
        int hours = scan.nextInt();
        if (hours <= 11) {
            System.out.println("Morning");
        } else if (hours >= 12 && hours <= 15) {
            System.out.println("Afternoon");
        } else if (hours >= 16 && hours <= 20) {
            System.out.println("Evening");
        } else if (hours >= 21 && hours <= 24) {
            System.out.println("Night");

        }
    }
}