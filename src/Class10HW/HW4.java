package Class10HW;

public class HW4 {
    public static void main(String[] args) {
        /*
        Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
        Print the sum of all numbers.
        */
        int[][] num = {
                {5, 10, 15},
                {10, 20, 30},
                {20, 40, 60}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int a = 0; a < num[i].length; a++) {
                sum += num[i][a];

            }

        }
        System.out.println(sum);

    }
}

