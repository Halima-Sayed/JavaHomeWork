package Class12HW;


import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        /*
Write a program that reads two people's first names
and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */
        Scanner scanner= new Scanner(System.in);
        System.out.println("What is the mothers first name?");
        String motherName= scanner.next();
        System.out.println("What is the fathers first name");
        String fatherName= scanner.next();
        System.out.println("What is the gender of the baby?");
        String gender= scanner.next();

        if(gender.equalsIgnoreCase("Boy")){
            System.out.println("Suggested boy name is "+fatherName.substring(0,4) + motherName.substring(2,4));

        }else if(gender.equalsIgnoreCase(("Girl"))){
            System.out.println("Suggested Girl name is "+motherName.substring(1,3) + fatherName.substring(fatherName.length()-1));

        }else{
            System.out.println("Please enter the gender of the baby");
        }
    }
}

