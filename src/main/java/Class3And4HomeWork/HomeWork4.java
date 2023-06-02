package Class3And4HomeWork;

public class HomeWork4 {
    public static void main(String[] args) {

       /*  Write a program to check whether number is positive or negative.
                Write a Java Program to check whether number is Even or Odd.

        */
        int pages = 20;
        if (pages > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        int pages2 = 7;
        System.out.println(pages2 % 2); // odd

        int num=3;
        int remainder=num%2;
        if (remainder==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }

    }

}
