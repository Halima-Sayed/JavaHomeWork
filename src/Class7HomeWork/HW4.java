package Class7HomeWork;

public class HW4 {
    public static void main(String[] args) {
        // Print odd numbers between 20 and 50 (2 ways)

        int num = 20;
        while (num <= 50) {
            if (num % 2 == 1) {
                System.out.print(num + " ");

            }
            num++;

        }
        for (int i=20; i<=50; i++){

            if (i%2==1){
                System.out.print(i+" ");
            }
        }

    }
}