package Class7HomeWork;

public class HW3 {
    public static void main(String[] args) {
        //  Print even numbers from 20 to 1 (2 ways)

        int num = 20;
        while (num >= 1 && num%2==0) {
            System.out.print(num+" ");
            num -= 2;


        }

         for (int i=20; i>=1; i-=2){
             System.out.print(i+" "); //
         }

        }
    }



